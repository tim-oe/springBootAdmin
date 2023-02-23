package org.tec.adminClient.actuator;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

/**
 * https://www.baeldung.com/spring-boot-actuators
 * https://www.javadevjournal.com/spring-boot/spring-boot-actuator-custom-endpoint/
 * https://stackoverflow.com/questions/53418992/spring-boot-admin-add-custom-tab/53462345#53462345
 */
@Component
@Endpoint(id = "custom")
public class FactoryEndpoint {
    boolean enabled;

    @ReadOperation
    public boolean isEnabled() {
        return enabled;
    }

    @WriteOperation
    public void setEnabled(@Selector boolean enabled) {
        this.enabled = enabled;
    }

    @DeleteOperation
    public void disable() {
        this.enabled = false;
    }
}