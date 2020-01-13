package com.telek.gt.fly.factory;

import com.telek.gt.fly.IgoChessman;
import com.telek.gt.fly.imp.BlackIgoChessman;
import com.telek.gt.fly.imp.WhiteIgoChessman;

import java.util.HashMap;
import java.util.Map;

public class IgochessmanFactory {
    private static IgochessmanFactory igochessmanFactory = new IgochessmanFactory();
    private static Map<String, IgoChessman> table;
    private IgochessmanFactory(){
        table = new HashMap<>();
        IgoChessman white = new WhiteIgoChessman();
        table.put("w", white);
        IgoChessman black = new BlackIgoChessman();
        table.put("b", black);
    }

    public static IgochessmanFactory getInstance(){
        return igochessmanFactory;
    }

    public IgoChessman getIgoChessman(String color){
        return table.get(color);
    }
}
