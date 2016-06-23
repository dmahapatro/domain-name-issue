package com.example

import grails.test.mixin.*
import spock.lang.Specification
import grails.test.mixin.integration.Integration
import grails.transaction.Rollback

@Integration
@Rollback
class SpecialServiceDomainSpec extends Specification {

    void "test something"() {
        given:
        new SpecialServiceDomain(name: 'Test').save(flush: true)
        
        expect: 
        SpecialServiceDomain.all
    }
}
