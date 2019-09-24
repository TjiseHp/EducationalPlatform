package com.hp.util;
import java.io.FileWriter;
import java.io.IOException;

/***
 * 	本类禁止编辑
 * @author ThinkPad
 *
 */
public class AlipayConfig {
	
	public static String app_id = "2016101200667181";
	
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC3Ger0QyNb844BVjF/TmVxpL26mfQ1OHrmi2bT/+Xx1OgN0fQJfzLMIXwEAO22K0zGuoNwv6tAmtxyTPA5Uc2Won3N5nqjiFWGmPDK2WXoNLwU2jkKdouvtpaNZD7v0L7KSoBaW0MU8a3KcvDcSDPX9VgBgfQV+FNzYFblyXDWl49uwSGx2ujAlualVRJtFSMJjCWx/RCELTITiM8tNrpfBysUIXO5wEwd+k7E/yPbKZTibf50YakFzfGKUkpVvKwxZZ+MZ7QDCs+TYbfU7WdfU2Su7H5uwf0yTBp+vdMXiAmIbp3ArVRfGeXDEJ0pCNnkCv90FIVY0CftxflgTcy7AgMBAAECggEAF1QoCWMceDS53RW8TLoSVr5kpgfDg5xknEcanNw30e4MeuZLL4KTWErT4Da2EsXFjHRrFsx051BT0gRXfxYbGZwuZzN8YKWYMAQAeffk8gb2B7oeFmUwOv0KhY1GL4vrIx8G53xFOb/pIqguZAKXCGbsBZUnIj13dHXL3I8j31NM+YxQqYL806cTg02na9LZhwjWG1/2ajDx/WLL+UJBryi7E2p8Rwy5zi7ZALrULtfGcvekqBZcUGabykla8LKkTEweIFPOrigIa3Jm/4lZ3bWkreQLozpMt/f5ZspbHH1KcFDdG4dn4Oc3Ei5qIkQv3oAxwqHajyVVqn0AGl3lsQKBgQDY7UETLgB5OMa5wnt5swKDqRNs0itHw3uPWpkYMHcn2tvdViHT0fG1ZhnLuv+OT/PJ/vNhzQWqeslYGS3FHy/RjsK9WHV2xhaNBxJ/38KsGLoGldlHC3lzsiPjM90NquXksjjysxQXd+ChZ/ZLSK02wWcDuDXyi8b3+qBk1wZAFwKBgQDYFO3O7ytdPQJMFcTZXxHItVLatwqSDYtOhgTT3bb1gBwHSLY8tU/hf2I5Gm/EVsj51b20ZE7r4RRKcBCtX9RhgTSfOw+kAdKEiqDw5IoJe/XSfhqWwjRdhyBDmAXPVPPZ+vXLDHqooNvxWcUEiMlz1qqY/ND8W9jn2JNxXAb6/QKBgQCj0/LcoFZdNqLm8dk83RPeCVgRTFzBcwIjDuImYZvr7p8z9vPPPHRWckizE4Qjn4BXooN+7k8EJH1hWoq1n8sGcdHjHCaCUDIBykCPcJdeT8JWbN9Oh3zvAq+VzLp6swGyiWL28IYQ/0kXvSNGUhn3C3NYXMvpZOUcrRxra/VdewKBgHwjkffnub8INNCnVP8YuivX2DDlJcKA236SSiW548mo/vFEWcYI2EqRl0l9IabnwPCfVixT0G99UN3vAfXI70fRJf0wviyYC2ywBARBF/iY6cIzRm1ERzdQUT3kEbpqcOnTXvB3S+Si/Zjr3N9dAnd1ZW8dF6dT0Qpph1OB7lS1AoGAE3WyGghzy5YFn+NTuxB1hrxerqkIpL+7s81IkfYJFqHHtag7YQpJfnwJ0/9++4H7dupvTjtJg959TbKcMwfBDYISGNSLyN1mYTwzvjpHsDQT1E9PkeAUe3ToDPgsTnD8jhkgHuR1ycRHos7ItsGjNi8nyPW1nwpV6BzIOR68SQ4=";
	
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkftxtnJKFwzfTq4/NPP668pj3DBwIandw+QSmrCZwQMigY4SFZvWBf2M3eVNPxDyaP7IGuWhq2w/gh65A2ULOqfkxZrK0pMgT0+BfthOKYIF9ErAXwY37k2l4gOgr0XSaLEzu2r1Y3A2GCc7OdZw4SOyae+JOKqMxGx0WwUbapGtOasKqpi2rlWT9Rj4JmnPBc7tLcyCp7q7LrqJLguUh82r0H+ZE8axQSQMrG63WbkWAy59xHwOqjixiMSeEyw/w8nGfOGZgtfuGs+Ho3Ruwqqenk419X7mJJ/qJYGwI3Oh31XEotf93TlxE2Vtfpm4hPiyi5Zl62Yg08B4Sm0JEQIDAQAB";

    //异步URL
	public static String notify_url = "http://localhost:8080/EducationalPlatform/alipay/notifyUrl";

	//同步URL
	public static String return_url = "http://localhost:8080/EducationalPlatform/alipay/returnUrl";

	public static String sign_type = "RSA2";
	
	public static String charset = "utf-8";
	
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	public static String log_path = "C:\\";



    /** 
	 * 	写日志，方便测试（可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

