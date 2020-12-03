package stringmethods.url;

import java.util.Arrays;
import java.util.List;

public class UrlManager {

    private String protocol; // lowercase, obligatory
    private Integer port;
    private String host; // lowercase, obligatory
    private String path; // null if missing
    private String query; // null if missing

    public UrlManager(String url) {

        int posEndProtocol = url.indexOf("://");
        int posStartPort = url.indexOf(":",posEndProtocol + 1);
        int posStartHost = posEndProtocol + 3;
        int posStartPath = url.indexOf("/",posStartHost);
        int posStartQuery = url.indexOf("?");

        protocol = readProtocol(url, posEndProtocol);
        port = readPort(url, posStartPort, posStartPath);
        host = readHost(url, posStartHost, posStartPort, posStartPath);
        path = readPath(url, posStartPath, posStartQuery);
        query = readQuery(url, posStartQuery);
    }

    private boolean isEmpty(String s) {
        return s == null || s.isBlank();
    }

    private String readProtocol(String s, int p) {
        try {
            return s.substring(0, p).toLowerCase();
        } catch (IndexOutOfBoundsException iob) {
            throw new IllegalArgumentException("Invalid url");
        }
    }

    private Integer readPort(String s, int i, int p) {
        if (i == -1) {
            return null;
        }
        try {
            if (p > 0) {
                return Integer.parseInt(s.substring(i + 1, p));
            } else {
                return Integer.parseInt(s.substring(i + 1));
            }
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException("Invalid Port");
        }
    }

    private String readHost(String s, int start, int startPort, int startPath) {
        if (start == s.length()) {
            throw new IllegalArgumentException("Invalid url");
        }
        if (startPort > 0) {
            return s.substring(start, startPort).toLowerCase();
        } else {
            return s.substring(start, startPath).toLowerCase();
        }
    }

    private String readPath(String s, int pPath, int pQuery) {
        if (pPath == -1) {
            return "";
        }
        if (pQuery > pPath) {
            return s.substring(pPath, pQuery);
        } else {
            return s.substring(pPath);
        }
    }

    private String readQuery(String s, int start) {
        if (start > -1) {
            return s.substring(start + 1);
        } else {
            return "";
        }
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public boolean hasProperty(String key) {
        if (isEmpty(key)) {
            throw new IllegalArgumentException();
        }
        return query.startsWith(key + "=") || query.contains("&" + key + "=");
    }

    public String getProperty(String key) {
        if (!isEmpty(key)) {
            List<String> properties = Arrays.asList(query.split("&"));
            for (String p : properties) {
                if (key.equals(p.substring(0, p.indexOf("=")))) {
                    return p.substring(p.indexOf("=") + 1);
                }
            }
        }
        return null;
    }
}