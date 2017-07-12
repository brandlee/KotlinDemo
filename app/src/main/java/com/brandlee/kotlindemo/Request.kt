package com.brandlee.kotlindemo

import android.util.Log
import java.net.URL

/**
 * @ClassName: Request
 * @Description:
 * @Author liqi1
 * @Date 17/6/7
 */
public class Request(val url: String) {
    public fun run() {
        var forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}
