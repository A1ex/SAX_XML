/*
 * Created on Nov 18, 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author Alexandru Popescu
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
//import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;


public class StudentHandler extends DefaultHandler {
  private float averagevalue = 0;
  private int arrearsnumber=0;
  private boolean scholarshipvalue=false;
  private String arrears = "";
  private String scholarship = "";
  private String series = "";
  private String average = "";
  private String name = "";
  private String identifier = "";
  private String identifiervalue = "";
  private String seriesvalue = "";
  private String namevalue = "";
  private final String SCHOLARSHIP = "SCHOLARSHIP";
  private final String SERIES = "SERIES";
  private final String ARREARS = "ARREARS";
  private final String NAME = "NAME";
  private final String ID = "ID";
  private final String AVERAGE = "AVERAGE";
  private final String STUDENT = "Student";
//  private final String STUDENTS = "Students";
  public int numberStudents = 0;
  public String[] s= new String[100];
  public String[] b= new String[100];
  public String[] r= new String[100];
  public String[] br= new String[100];
  public String[] sch= new String[100];
  public String[] gra1= new String[100];
  public String[] gra2= new String[100];
  public String[] gra3= new String[100];
  public int i,j,k,l,o1,o2,o3,t=0;

  /**
   * Returns Total for current XML Order
   * @return sOrderPrice - String
   */
  public float getStudentAverage(){
    return averagevalue;
  }
  public int getNumberStudents(){
    return numberStudents;
  }
  /**
   * Receive notification of the start of an element.
   * @param namespaceURI - The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed.
   * @param localName - The local name (without prefix), or the empty string if Namespace processing is not being performed.
   * @param qName - The qualified name (with prefix), or the empty string if qualified names are not available.
   * @param atts - The attributes attached to the element. If there are no attributes, it shall be an empty Attributes object.
   * @throws SAXException - Any SAX exception, possibly wrapping another exception.
   */
    @Override
  public void startElement(String namespaceURI, String localName, String qName, Attributes atts)
      throws SAXException {    
    if (STUDENT.equals(localName)){
      numberStudents++;
    }
    if (ID.equals(localName)){
      identifier=ID;
    }
    if (NAME.equals(localName)){
      name=NAME;
    }
    if (AVERAGE.equals(localName)){
      average = AVERAGE;
    }
    if (ARREARS.equals(localName)){
      arrears = ARREARS;
    }
    if (SERIES.equals(localName)){
      series = SERIES;
    }
    if (SCHOLARSHIP.equals(localName)){
      scholarship = SCHOLARSHIP;
    }
  }

  /**
   * Receive notification of character data inside an element.
   * @param ch - The characters.
   * @param start - The start position in the character array.
   * @param length - The number of characters to use from the character array.
   * @throws SAXException - Any SAX exception, possibly wrapping another exception.
   */
    @Override
  public void characters(char[] ch, int start, int length)
      throws SAXException {
    float floatValue = 0;
    int intValue=0;
    boolean boolValue=false;
    if (AVERAGE.equals(average)){
        String strValue = new String(ch, start, length);
        floatValue = Float.valueOf(strValue).floatValue();
        averagevalue = floatValue;
    }
    if (SCHOLARSHIP.equals(scholarship)){
        String strValue = new String(ch, start, length);
        boolValue = Boolean.parseBoolean(strValue);
        scholarshipvalue = boolValue;        
    }
    if (ARREARS.equals(arrears)){
        String strValue = new String(ch, start, length);
        intValue = Integer.parseInt(strValue);
        arrearsnumber = intValue;
    }
     if (ID.equals(identifier)){
        String strValue = new String(ch, start, length);
        identifiervalue = strValue;
    }
    if (NAME.equals(name)){
        String strValue = new String(ch, start, length);
        namevalue = strValue;
    }
    if (SERIES.equals(series)){
        String strValue = new String(ch, start, length);
        seriesvalue = strValue;
    }
  }

  /**
   * Receive notification of the end of an element.
   * @param namespaceURI - The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed.
   * @param localName - The local name (without prefix), or the empty string if Namespace processing is not being performed.
   * @param qName - The qualified name (with prefix), or the empty string if qualified names are not available.
   * @throws SAXException - Any SAX exception, possibly wrapping another exception.
   */
    @Override
    public void endElement(String namespaceURI, String localName, String qName)
      throws SAXException {
    if (STUDENT.equals(localName)){      
        s[i]="Student with id = " + identifiervalue +" "+ namevalue;
        if ((getStudentAverage()>8.00)&&(arrearsnumber>0)){
            k=k+1;
            br[k]="Student with id = " + identifiervalue +" "+ namevalue ;
        }
        if(getStudentAverage()>8.00){
            j=j+1;
            b[j]="Student with id = " + identifiervalue +" "+ namevalue;
        }
        if (arrearsnumber>0){
            l=l+1;
            r[l]="Student with id = " + identifiervalue +" "+ namevalue;
        }
        if (seriesvalue.equals("A1")){
            o1=o1+1;
            gra1[o1]="Student with id = " + identifiervalue +" "+ namevalue;
        }
        if (seriesvalue.equals("A2")){
            o2=o2+1;
            gra2[o2]="Student with id = " + identifiervalue +" "+ namevalue;
        }
        if (seriesvalue.equals("A3")){
            o3=o3+1;
            gra3[o3]="Student with id = " + identifiervalue +" "+ namevalue;
        }
        if (scholarshipvalue==true){
            t=t+1;
            sch[t]="Student with id = " + identifiervalue +" "+ namevalue;
        }
      i=i+1;
    }
    if (AVERAGE.equals(localName)){
      average = "";
    }
    if (ARREARS.equals(localName)){
      arrears = "";
    }
    if (ID.equals(localName)){
      identifier = "";
    }
    if (NAME.equals(localName)){
      name = "";
    }
    if (SERIES.equals(localName)){
      series = "";
    }
    if (SCHOLARSHIP.equals(localName)){
      scholarship = "";
    }
  }
}

