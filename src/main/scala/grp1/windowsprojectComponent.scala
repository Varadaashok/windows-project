package grp1


import org.apache.camel.Endpoint
import org.apache.camel.impl.DefaultComponent
import java.util.Map

/**
 * Represents the component that manages {@link windowsprojectEndpoint}.
 */
class windowsprojectComponent extends DefaultComponent {

  protected def createEndpoint(uri: String, remaining: String, parameters: Map[String, Object]): Endpoint = {

    val endpoint = new windowsprojectEndpoint(uri, this)
    setProperties(endpoint, parameters)

    endpoint
  }
}
