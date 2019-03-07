package demo.service

import demo.domain.Order
import spock.lang.Shared
import spock.lang.Specification

class EmailServiceSpec extends Specification{
    @Shared
    Order order

    @Shared
    EmailService emailService

    def setupSpec() {
        emailService = EmailService.getInstance()
        order = Mock(Order)
    }

    def "GetInstance"() {
        expect:
        emailService == EmailService.getInstance()
    }

    def "void SendEmail"() {
        when:
        emailService.sendEmail(order)
        then:
        thrown(RuntimeException)
    }

    def "Boolean SendEmail"() {
        expect:
        emailService.sendEmail(order, "name@domain.com")
    }
}