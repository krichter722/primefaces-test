package org.primefaces.test;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class BackingBean0 implements Serializable {
    private String activeIndex;

    @PostConstruct
    private void init() {
        this.activeIndex = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("activeIndex");
    }

    public String getActiveIndex() {
        return activeIndex;
    }

    public void setActiveIndex(String activeIndex) {
        this.activeIndex = activeIndex;
    }
}
