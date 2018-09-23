package com.exaccu.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Author:liuzhixiang
 * PackageName:com.exaccu.latte.ec.icon
 * Create by 17864 on 2018/9/23
 *
 * @ Description:
 */
public enum  EcIcons implements Icon{
    icon_scan('\ue602'),
    icon_ali_pay('\ue606');

    private char character;

    EcIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
