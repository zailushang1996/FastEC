package com.exaccu.latte.ec.icon;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

/**
 * Author:liuzhixiang
 * PackageName:com.exaccu.latte.ec.icon
 * Create by 17864 on 2018/9/23
 *
 * @ Description:
 */
public class FontEcModule implements IconFontDescriptor {
    @Override
    public String ttfFileName() {
        return "iconfont.ttf";
    }

    @Override
    public Icon[] characters() {
        return EcIcons.values();
    }
}
