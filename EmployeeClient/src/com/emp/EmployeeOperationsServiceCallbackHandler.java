
/**
 * EmployeeOperationsServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.emp;

    /**
     *  EmployeeOperationsServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class EmployeeOperationsServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public EmployeeOperationsServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public EmployeeOperationsServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for deleteEmpDetails method
            * override this method for handling normal response from deleteEmpDetails operation
            */
           public void receiveResultdeleteEmpDetails(
                    com.emp.EmployeeOperationsServiceStub.DeleteEmpDetailsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteEmpDetails operation
           */
            public void receiveErrordeleteEmpDetails(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertEmpDetails method
            * override this method for handling normal response from insertEmpDetails operation
            */
           public void receiveResultinsertEmpDetails(
                    com.emp.EmployeeOperationsServiceStub.InsertEmpDetailsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertEmpDetails operation
           */
            public void receiveErrorinsertEmpDetails(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateEmpDetails method
            * override this method for handling normal response from updateEmpDetails operation
            */
           public void receiveResultupdateEmpDetails(
                    com.emp.EmployeeOperationsServiceStub.UpdateEmpDetailsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateEmpDetails operation
           */
            public void receiveErrorupdateEmpDetails(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for selectEmpDetails method
            * override this method for handling normal response from selectEmpDetails operation
            */
           public void receiveResultselectEmpDetails(
                    com.emp.EmployeeOperationsServiceStub.SelectEmpDetailsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from selectEmpDetails operation
           */
            public void receiveErrorselectEmpDetails(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for selectAllEmpDetails method
            * override this method for handling normal response from selectAllEmpDetails operation
            */
           public void receiveResultselectAllEmpDetails(
                    com.emp.EmployeeOperationsServiceStub.SelectAllEmpDetailsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from selectAllEmpDetails operation
           */
            public void receiveErrorselectAllEmpDetails(java.lang.Exception e) {
            }
                


    }
    