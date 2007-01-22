/**
 * TicketServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.idega.block.sso.webservice.server.ticketService;

public class TicketServiceSoapBindingSkeleton implements com.idega.block.sso.webservice.server.ticketService.TicketService, org.apache.axis.wsdl.Skeleton {
    private com.idega.block.sso.webservice.server.ticketService.TicketService impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("validateTicket", _params, new javax.xml.namespace.QName("", "validateTicketReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:com.idega.block.sso.webservice", "validateTicket"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("validateTicket") == null) {
            _myOperations.put("validateTicket", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("validateTicket")).add(_oper);
    }

    public TicketServiceSoapBindingSkeleton() {
        this.impl = new com.idega.block.sso.webservice.server.ticketService.TicketServiceSoapBindingImpl();
    }

    public TicketServiceSoapBindingSkeleton(com.idega.block.sso.webservice.server.ticketService.TicketService impl) {
        this.impl = impl;
    }
    public boolean validateTicket(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException
    {
        boolean ret = this.impl.validateTicket(in0, in1);
        return ret;
    }

}
