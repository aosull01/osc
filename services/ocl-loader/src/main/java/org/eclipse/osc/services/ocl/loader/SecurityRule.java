package org.eclipse.osc.services.ocl.loader;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SecurityRule extends RuntimeBase {

    private String name;
    private Integer priority;
    private String protocol;
    private String cidr;
    private String direction;
    private String ports;
    private String action;

}
