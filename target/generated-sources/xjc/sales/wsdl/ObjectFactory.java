//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 12:36:23 PM MST 
//


package sales.wsdl;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sales.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _CustomerWrapper_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "Customer.Wrapper");
    private final static QName _ArrayOfInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "ArrayOfInformation");
    private final static QName _Information_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "Information");
    private final static QName _GetContractEligibilityByRootRootContract_QNAME = new QName("http://tempuri.org/", "rootContract");
    private final static QName _GetContractEligibilityByRootStartsWith_QNAME = new QName("http://tempuri.org/", "startsWith");
    private final static QName _GetContractEligibilityByRootResponseGetContractEligibilityByRootResult_QNAME = new QName("http://tempuri.org/", "GetContractEligibilityByRootResult");
    private final static QName _InformationAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "Address");
    private final static QName _InformationCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "City");
    private final static QName _InformationClassofTrade_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "ClassofTrade");
    private final static QName _InformationCommitmentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "CommitmentType");
    private final static QName _InformationContractName_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "ContractName");
    private final static QName _InformationContractType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "ContractType");
    private final static QName _InformationCustomerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "CustomerName");
    private final static QName _InformationCustomerType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "CustomerType");
    private final static QName _InformationCustomerTypeDsc_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "CustomerTypeDsc");
    private final static QName _InformationGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "Group");
    private final static QName _InformationNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "Number");
    private final static QName _InformationState_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "State");
    private final static QName _InformationZip_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "Zip");
    private final static QName _CustomerWrapperCustomers_QNAME = new QName("http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", "Customers");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sales.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetContractEligibilityByRoot }
     * 
     */
    public GetContractEligibilityByRoot createGetContractEligibilityByRoot() {
        return new GetContractEligibilityByRoot();
    }

    /**
     * Create an instance of {@link GetContractEligibilityByRootResponse }
     * 
     */
    public GetContractEligibilityByRootResponse createGetContractEligibilityByRootResponse() {
        return new GetContractEligibilityByRootResponse();
    }

    /**
     * Create an instance of {@link CustomerWrapper }
     * 
     */
    public CustomerWrapper createCustomerWrapper() {
        return new CustomerWrapper();
    }

    /**
     * Create an instance of {@link ArrayOfInformation }
     * 
     */
    public ArrayOfInformation createArrayOfInformation() {
        return new ArrayOfInformation();
    }

    /**
     * Create an instance of {@link Information }
     * 
     */
    public Information createInformation() {
        return new Information();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "Customer.Wrapper")
    public JAXBElement<CustomerWrapper> createCustomerWrapper(CustomerWrapper value) {
        return new JAXBElement<CustomerWrapper>(_CustomerWrapper_QNAME, CustomerWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "ArrayOfInformation")
    public JAXBElement<ArrayOfInformation> createArrayOfInformation(ArrayOfInformation value) {
        return new JAXBElement<ArrayOfInformation>(_ArrayOfInformation_QNAME, ArrayOfInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Information }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "Information")
    public JAXBElement<Information> createInformation(Information value) {
        return new JAXBElement<Information>(_Information_QNAME, Information.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rootContract", scope = GetContractEligibilityByRoot.class)
    public JAXBElement<String> createGetContractEligibilityByRootRootContract(String value) {
        return new JAXBElement<String>(_GetContractEligibilityByRootRootContract_QNAME, String.class, GetContractEligibilityByRoot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "startsWith", scope = GetContractEligibilityByRoot.class)
    public JAXBElement<String> createGetContractEligibilityByRootStartsWith(String value) {
        return new JAXBElement<String>(_GetContractEligibilityByRootStartsWith_QNAME, String.class, GetContractEligibilityByRoot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetContractEligibilityByRootResult", scope = GetContractEligibilityByRootResponse.class)
    public JAXBElement<CustomerWrapper> createGetContractEligibilityByRootResponseGetContractEligibilityByRootResult(CustomerWrapper value) {
        return new JAXBElement<CustomerWrapper>(_GetContractEligibilityByRootResponseGetContractEligibilityByRootResult_QNAME, CustomerWrapper.class, GetContractEligibilityByRootResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "Address", scope = Information.class)
    public JAXBElement<String> createInformationAddress(String value) {
        return new JAXBElement<String>(_InformationAddress_QNAME, String.class, Information.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "City", scope = Information.class)
    public JAXBElement<String> createInformationCity(String value) {
        return new JAXBElement<String>(_InformationCity_QNAME, String.class, Information.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "ClassofTrade", scope = Information.class)
    public JAXBElement<String> createInformationClassofTrade(String value) {
        return new JAXBElement<String>(_InformationClassofTrade_QNAME, String.class, Information.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "CommitmentType", scope = Information.class)
    public JAXBElement<String> createInformationCommitmentType(String value) {
        return new JAXBElement<String>(_InformationCommitmentType_QNAME, String.class, Information.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "ContractName", scope = Information.class)
    public JAXBElement<String> createInformationContractName(String value) {
        return new JAXBElement<String>(_InformationContractName_QNAME, String.class, Information.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "ContractType", scope = Information.class)
    public JAXBElement<String> createInformationContractType(String value) {
        return new JAXBElement<String>(_InformationContractType_QNAME, String.class, Information.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "CustomerName", scope = Information.class)
    public JAXBElement<String> createInformationCustomerName(String value) {
        return new JAXBElement<String>(_InformationCustomerName_QNAME, String.class, Information.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "CustomerType", scope = Information.class)
    public JAXBElement<String> createInformationCustomerType(String value) {
        return new JAXBElement<String>(_InformationCustomerType_QNAME, String.class, Information.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "CustomerTypeDsc", scope = Information.class)
    public JAXBElement<String> createInformationCustomerTypeDsc(String value) {
        return new JAXBElement<String>(_InformationCustomerTypeDsc_QNAME, String.class, Information.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "Group", scope = Information.class)
    public JAXBElement<String> createInformationGroup(String value) {
        return new JAXBElement<String>(_InformationGroup_QNAME, String.class, Information.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "Number", scope = Information.class)
    public JAXBElement<String> createInformationNumber(String value) {
        return new JAXBElement<String>(_InformationNumber_QNAME, String.class, Information.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "State", scope = Information.class)
    public JAXBElement<String> createInformationState(String value) {
        return new JAXBElement<String>(_InformationState_QNAME, String.class, Information.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "Zip", scope = Information.class)
    public JAXBElement<String> createInformationZip(String value) {
        return new JAXBElement<String>(_InformationZip_QNAME, String.class, Information.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SFDC.Services.DataContract.Contract", name = "Customers", scope = CustomerWrapper.class)
    public JAXBElement<ArrayOfInformation> createCustomerWrapperCustomers(ArrayOfInformation value) {
        return new JAXBElement<ArrayOfInformation>(_CustomerWrapperCustomers_QNAME, ArrayOfInformation.class, CustomerWrapper.class, value);
    }

}