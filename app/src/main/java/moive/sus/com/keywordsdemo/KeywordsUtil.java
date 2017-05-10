package moive.sus.com.keywordsdemo;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by linksus on 5/10 0010.
 * 关键词高亮 工具类
 */

public class KeywordsUtil {

    /**
     * 关键词高亮 变色
     *
     * @param color    变化的色值
     * @param text     文字
     * @param keywords 文字中的关键字
     * @return
     */
    public static SpannableString matcherSearchTitle(int color, String text, String keywords) {
        SpannableString spannableString = new SpannableString(text);
        Pattern pattern = Pattern.compile(keywords);
        Matcher matcher = pattern.matcher(spannableString);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            spannableString.setSpan(new ForegroundColorSpan(color), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }

        return spannableString;
    }

    /**
     * 多个关键词高亮 变色
     *
     * @param color    变化的色值
     * @param text     文字
     * @param keywords 文字中的关键字
     * @return
     */
    public static SpannableString matcherSearchTitle(int color, String text, String[] keywords) {
        SpannableString spannableString = new SpannableString(text);
        for (int i = 0; i < keywords.length; i++) {
            Pattern pattern = Pattern.compile(keywords[i]);
            Matcher matcher = pattern.matcher(spannableString);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                spannableString.setSpan(new ForegroundColorSpan(color), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }
        return spannableString;
    }
}
