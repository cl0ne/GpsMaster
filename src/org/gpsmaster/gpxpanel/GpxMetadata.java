package org.gpsmaster.gpxpanel;

import com.topografix.gpx._1._1.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Class overriding [{@link MetadataType} from GPX schema with GpsMaster-specific sourceFmt type
 *
 * @author rfu
 */
public class GpxMetadata extends MetadataType {

    protected GPXExtension extension = new GPXExtension();

    /**
     * Constructor
     */
    GpxMetadata() {
        super();

        // Workaround, copied from MetadataType in GIS lib found @ gpsmaster.org
        this.name = "";
        this.desc = "";
        this.copyright = new CopyrightType();
        this.link = new ArrayList<>();
        this.keywords = "";
        this.bounds = new BoundsType();
        this.extensions = new ExtensionsType();
    }

    public void setTime(String isoDate) {
        try {
            this.time = DatatypeFactory.newInstance().newXMLGregorianCalendar(isoDate);
        } catch (DatatypeConfigurationException ignored) {
        }
    }

    public void setTime(Date time) {
        try {
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(time);
            this.time = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
        } catch (DatatypeConfigurationException ignored) {
        }
    }

    public Date getTimeAsDate() {
        return getTime().toGregorianCalendar().getTime();
    }

    public GPXExtension getExtension() {
        return extension;
    }

    public void setExtension(GPXExtension extension) {
        this.extension = extension;
    }
}
