import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/**
 * @author Actionding
 * @create 2022-04-22 14:52
 */
public class Test {
    public static void main(String[] args) throws Exception {
//        String result = get("http://www.baidu.com");
//        String result = get("http://weixin.actionding.xyz/wx?signature=5619a1416af5514fbbd328b5f12d6475a181ea4f&echostr=4185001953370536925&timestamp=1650608844&nonce=208652542");
//        String result = get("http://localhost:8080/wx?signature=5619a1416af5514fbbd328b5f12d6475a181ea4f&echostr=4185001953370536925&timestamp=1650608844&nonce=208652542");
        String result = get("http://apis.juhe.cn/simpleWeather/query?city=上海&key=47956c2495960e466594093aa62e16a8");

        /*
        {
	"reason":"查询成功!",
	"result":{
		"city":"上海",
		"realtime":{
			"temperature":"22",
			"humidity":"82",
			"info":"阴",
			"wid":"02",
			"direct":"西风",
			"power":"2级",
			"aqi":"67"
		},
		"future":[
			{
				"date":"2022-04-22",
				"temperature":"18\/29℃",
				"weather":"多云转中雨",
				"wid":{
					"day":"01",
					"night":"08"
				},
				"direct":"南风转东南风"
			},
			{
				"date":"2022-04-23",
				"temperature":"16\/21℃",
				"weather":"小雨转阴",
				"wid":{
					"day":"07",
					"night":"02"
				},
				"direct":"东风转东南风"
			},
			{
				"date":"2022-04-24",
				"temperature":"18\/25℃",
				"weather":"多云",
				"wid":{
					"day":"01",
					"night":"01"
				},
				"direct":"东南风"
			},
			{
				"date":"2022-04-25",
				"temperature":"19\/27℃",
				"weather":"小雨",
				"wid":{
					"day":"07",
					"night":"07"
				},
				"direct":"南风转西南风"
			},
			{
				"date":"2022-04-26",
				"temperature":"16\/24℃",
				"weather":"多云",
				"wid":{
					"day":"01",
					"night":"01"
				},
				"direct":"南风"
			}
		]
	},
	"error_code":0
}
         */


        System.out.println("result: \n"+result);
    }

    public static String get(String url) throws Exception {
        String content = null;
        URLConnection urlConnection = new URL(url).openConnection();
        HttpURLConnection connection = (HttpURLConnection) urlConnection;
        connection.setRequestMethod("GET");

        //连接
        connection.connect();
        //得到响应码
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader
                    (connection.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder bs = new StringBuilder();
            String l;
            while ((l = bufferedReader.readLine()) != null) {
                bs.append(l).append("\n");
            }
            content = bs.toString();
        }
        return content;
    }
}
