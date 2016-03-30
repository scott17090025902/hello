package alpha.scott.test;

import com.google.common.collect.Lists;
import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * Created by gst on 2016/3/29.
 */
public class Util {
    private Util(){};

    /**
     * 将800多个类似于example.txt中数据，先根据","分组，
     * 再根据“:”分组取出第二个
     * @param origin
     * @return
     */
    public static List<String> transform(String origin){
        String[] strArray1 =   StringUtils.split(origin,",");
        String[] strArray2;
        List<String> strings = Lists.newArrayList();
        for(String s:strArray1){
            strArray2 =StringUtils.split(s,":");
            strings.add(strArray2[1]);
        }
        return strings;
    }

    /**
     *
     * @param origins 待比较的字符串，包含较少的词
     * @param compareStrings 包含800个词
     *
     * @return 如果origin中的词全部在compareStrings中，返回true
     */
    public static boolean isAllWorldIn(String origins,List<String> compareStrings){
        String[] origin =StringUtils.split(origins," ");
        int count = 0;

        for(String s:origin){
            for(String s1 : compareStrings){
                if(s.equals(s1)){
                    count++;break;//如果在其中，计数
                }
            }
        }

        return  count==origin.length;
    }

    /**
     * 传入两个字符串A和B，比较是否A全部命中B
     * @param origins
     * @param origins2
     * @return
     */
    public static boolean isAllWorldIn(String origins,String origins2){
        List<String> compareStrings = transform(origins2);
        return isAllWorldIn(origins,compareStrings);
    }
}
