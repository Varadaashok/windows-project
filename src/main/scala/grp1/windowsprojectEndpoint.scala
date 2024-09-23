package grp1

import org.apache.camel.{Consumer, Processor, Producer}
import org.apache.camel.impl.DefaultEndpoint

/**
 * Represents a windowsproject endpoint.
 */
class windowsprojectEndpoint(uri:String, component: windowsprojectComponent) extends DefaultEndpoint(uri, component) {

  def createProducer() : Producer = {
    new windowsprojectProducer(this)
  }

  def createConsumer(processor: Processor) : Consumer = {
    new windowsprojectConsumer(this, processor)
  }

  def isSingleton() : Boolean = true

}
