/* 
 * Copyright (c) 2007, Fraunhofer-Gesellschaft
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * 
 * (1) Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the disclaimer at the end.
 *     Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in
 *     the documentation and/or other materials provided with the
 *     distribution.
 * 
 * (2) Neither the name of Fraunhofer nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 * 
 * DISCLAIMER
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *  
 */
package org.ogf.graap.wsag.server.api.impl;

import java.util.UUID;

import org.apache.log4j.Logger;
import org.ogf.graap.wsag.api.AgreementOffer;
import org.ogf.graap.wsag.api.types.AbstractAgreementType;
import org.ogf.schemas.graap.wsAgreement.AgreementPropertiesType;
import org.ogf.schemas.graap.wsAgreement.AgreementStateDefinition;
import org.ogf.schemas.graap.wsAgreement.TerminateInputType;

/**
 * PendingAgreementImpl
 * 
 * Simple container type for a pending agreement instance.
 * 
 * @author Oliver Waeldrich
 * 
 */
public class PendingAgreementImpl extends AbstractAgreementType
{

    private static Logger log = Logger.getLogger( PendingAgreementImpl.class );

    /**
     * Creates a pending agreement for an offer.
     * 
     * @param offer
     *            the agreement offer
     */
    public PendingAgreementImpl( AgreementOffer offer )
    {
        super( offer );

        String agreementId = offer.getAgreementId();
        if ( agreementId == null || agreementId.equals( "" ) )
        {
            agreementId = UUID.randomUUID().toString();
            this.setAgreementId( agreementId );

            log.warn( "Offer does not contains an agreement id. Generated a new agreement id '" + agreementId
                + "'." );
        }
    }

    /**
     * Creates a pending agreement for an properties.
     * 
     * @param properties
     *            the agreement properties
     */
    public PendingAgreementImpl( AgreementPropertiesType properties )
    {
        super( properties );
    }

    /**
     * Just change the state to pending and terminating.
     * 
     * @param reason
     *            the termination reason
     */
    public void terminate( TerminateInputType reason )
    {
        getState().setState( AgreementStateDefinition.PENDING_AND_TERMINATING );
    }
}
