package com.example

import grails.test.mixin.*
import spock.lang.Specification
import grails.test.mixin.integration.Integration
import grails.transaction.Rollback

@Integration
@Rollback
class SpecialServiceSpec extends Specification {

    void "test something"() {
        given:
        new SpecialService(name: 'Test').save(flush: true)
        
        expect: 
        SpecialService.all
    }
}
