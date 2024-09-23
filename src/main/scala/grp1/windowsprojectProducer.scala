package grp1

import org.apache.camel.Exchange
import org.apache.camel.impl.DefaultProducer


/**
 * The windowsproject producer.
 */
class windowsprojectProducer(endpoint: windowsprojectEndpoint) extends DefaultProducer(endpoint) {

  def process(exchange: Exchange) : Unit = {
    println(exchange.getIn().getBody())
  }

}
