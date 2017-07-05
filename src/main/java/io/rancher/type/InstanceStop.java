package io.rancher.type;

import io.rancher.base.AbstractType;

public class InstanceStop extends AbstractType {
    
    private Boolean remove;
    
    private Integer timeout;
    
    public Boolean getRemove() {
        return this.remove;
    }

    public void setRemove(Boolean remove) {
      this.remove = remove;
    }
    
    public Integer getTimeout() {
        return this.timeout;
    }

    public void setTimeout(Integer timeout) {
      this.timeout = timeout;
    }
    
}
