package org.ejb.client;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ejb.cotainer.MiInterfaceEJB2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClientController {

    @Resource(name = "jotaEBJ222")
    public MiInterfaceEJB2 jotaEBJ222;

    public ClientController() {

    }

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public String client(ModelMap model, HttpServletRequest request,
            HttpServletResponse response) {
        model.addAttribute("client", jotaEBJ222.saludando("diana"));
        return "client";
    }

    /**
     * @return the jotaEBJ222
     */
    public MiInterfaceEJB2 getJotaEBJ222() {
        return jotaEBJ222;
    }

    /**
     * @param jotaEBJ222 the jotaEBJ222 to set
     */
    public void setJotaEBJ222(MiInterfaceEJB2 jotaEBJ222) {
        this.jotaEBJ222 = jotaEBJ222;
    }



}
