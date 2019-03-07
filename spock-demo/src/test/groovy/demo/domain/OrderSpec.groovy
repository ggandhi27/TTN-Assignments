package demo.domain

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class OrderSpec extends Specification{
    //   Field is shared among all feature methods
    @Shared
    Order order

    def setupSpec() {
        order = new Order(10, "item", 25)
    }

    @Unroll("Setting quantity to #quant")
    def "GetQuantity"() {
        expect:
        order.setQuantity(quant)
        order.getQuantity() == result
        where:
        quant << [1, -1]
        result << [1, -1]
    }

    @Unroll("Setting quantity to #quant")
    def "SetQuantity"() {
        expect:
        order.setQuantity(quant).getQuantity() == result
        where:
        quant << [1, -1]
        result << [1, -1]
    }

    @Unroll("Setting ItemName to #item")
    def "GetItemName"() {
        expect:
        order.setItemName(item)
        order.getItemName() == result
        where:
        item << ["apple", "banana"]
        result << ["apple", "banana"]
    }

    @Unroll("Setting ItemName to #item")
    def "SetItemName"() {
        expect:
        order.setItemName(item).getItemName() == result
        where:
        item << ["apple", "banana"]
        result << ["apple", "banana"]
    }

    @Unroll("Setting Price to #price")
    def "GetPrice"() {
        expect:
        order.setPrice(price)
        order.getPrice() == result
        where:
        price << [1, -1]
        result << [1, -1]
    }

    @Unroll("Setting Price to #price")
    def "SetPrice"() {
        expect:
        order.setPrice(price).getPrice() == result
        where:
        price << [1, -1]
        result << [1, -1]
    }

    @Unroll("Setting PriceWithTex to #priceWithTex")
    def "GetPriceWithTex"() {
        expect:
        order.setPriceWithTex(priceWithTex)
        order.getPriceWithTex() == result
        where:
        priceWithTex << [1, -1]
        result << [1, -1]
    }

    @Unroll("Setting PriceWithTex to #priceWithTex")
    def "SetPriceWithTex"() {
        expect:
        order.setPriceWithTex(priceWithTex).getPriceWithTex() == result
        where:
        priceWithTex << [1, -1]
        result << [1, -1]
    }
}
