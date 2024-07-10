package com.jieun.tour_map_groovy;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.devs.vectorchildfinder.VectorChildFinder;
import com.devs.vectorchildfinder.VectorDrawableCompat;

public class MainActivity extends AppCompatActivity {

    VectorDrawableCompat.VFullPath dressPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView ivKorea = findViewById(R.id.map);

        VectorChildFinder vector = new VectorChildFinder(this, R.drawable.map, ivKorea);


        VectorDrawableCompat.VFullPath seoul = vector.findPathByName("seoul");
        //강원도 18
        VectorDrawableCompat.VFullPath kw_goseong = vector.findPathByName("kw_goseong");
        VectorDrawableCompat.VFullPath sokcho = vector.findPathByName("sokcho");
        VectorDrawableCompat.VFullPath yangyang = vector.findPathByName("yangyang");
        VectorDrawableCompat.VFullPath injae = vector.findPathByName("injae");
        VectorDrawableCompat.VFullPath yanggu = vector.findPathByName("yanggu");
        VectorDrawableCompat.VFullPath gangneung = vector.findPathByName("gangneung");
        VectorDrawableCompat.VFullPath donghae = vector.findPathByName("donghae");
        VectorDrawableCompat.VFullPath samcheok = vector.findPathByName("samcheok");
        VectorDrawableCompat.VFullPath taebeak = vector.findPathByName("taebeak");
        VectorDrawableCompat.VFullPath jeongseon = vector.findPathByName("jeongseon");
        VectorDrawableCompat.VFullPath pyeongchang = vector.findPathByName("pyeongchang");
        VectorDrawableCompat.VFullPath hongcheon = vector.findPathByName("hongcheon");
        VectorDrawableCompat.VFullPath hoengseong = vector.findPathByName("hoengseong");
        VectorDrawableCompat.VFullPath wonju = vector.findPathByName("wonju");
        VectorDrawableCompat.VFullPath yeongwol = vector.findPathByName("yeongwol");
        VectorDrawableCompat.VFullPath hwacheon = vector.findPathByName("hwacheon");
        VectorDrawableCompat.VFullPath cheorwon = vector.findPathByName("cheorwon");
        VectorDrawableCompat.VFullPath chuncheon = vector.findPathByName("chuncheon");

        //경기도 31
        VectorDrawableCompat.VFullPath yeoncheon = vector.findPathByName("yeoncheon");
        VectorDrawableCompat.VFullPath pocheon = vector.findPathByName("pocheon");
        VectorDrawableCompat.VFullPath gapyeong = vector.findPathByName("gapyeong");
        VectorDrawableCompat.VFullPath yangpyeong = vector.findPathByName("yangpyeong");
        VectorDrawableCompat.VFullPath yeoju = vector.findPathByName("yeoju");
        VectorDrawableCompat.VFullPath icheon = vector.findPathByName("icheon");
        VectorDrawableCompat.VFullPath gwangju = vector.findPathByName("gwangju");
        VectorDrawableCompat.VFullPath namyangju = vector.findPathByName("namyangju");
        VectorDrawableCompat.VFullPath hanam = vector.findPathByName("hanam");
        VectorDrawableCompat.VFullPath guli = vector.findPathByName("guli");
        VectorDrawableCompat.VFullPath uijeongbu = vector.findPathByName("uijeongbu");
        VectorDrawableCompat.VFullPath yangju = vector.findPathByName("yangju");
        VectorDrawableCompat.VFullPath dongducheon = vector.findPathByName("dongducheon");
        VectorDrawableCompat.VFullPath paju = vector.findPathByName("paju");
        VectorDrawableCompat.VFullPath goyang = vector.findPathByName("goyang");
        VectorDrawableCompat.VFullPath gimpo = vector.findPathByName("gimpo");
        VectorDrawableCompat.VFullPath bucheon = vector.findPathByName("bucheon");
        VectorDrawableCompat.VFullPath gwangmyeong = vector.findPathByName("gwangmyeong");
        VectorDrawableCompat.VFullPath siheung = vector.findPathByName("siheung");
        VectorDrawableCompat.VFullPath ansan = vector.findPathByName("ansan");
        VectorDrawableCompat.VFullPath gunpo = vector.findPathByName("gunpo");
        VectorDrawableCompat.VFullPath anyang = vector.findPathByName("anyang");
        VectorDrawableCompat.VFullPath uiwang = vector.findPathByName("uiwang");
        VectorDrawableCompat.VFullPath gwacheon = vector.findPathByName("gwacheon");
        VectorDrawableCompat.VFullPath seongnam = vector.findPathByName("seongnam");
        VectorDrawableCompat.VFullPath suwon = vector.findPathByName("suwon");
        VectorDrawableCompat.VFullPath hwaseong = vector.findPathByName("hwaseong");
        VectorDrawableCompat.VFullPath pyeongtaeg = vector.findPathByName("pyeongtaeg");
        VectorDrawableCompat.VFullPath ansung = vector.findPathByName("ansung");
        VectorDrawableCompat.VFullPath yongin = vector.findPathByName("yongin");
        VectorDrawableCompat.VFullPath osan = vector.findPathByName("osan");

        //충북 13
        VectorDrawableCompat.VFullPath danyang = vector.findPathByName("danyang");
        VectorDrawableCompat.VFullPath jecheon = vector.findPathByName("jecheon");
        VectorDrawableCompat.VFullPath chungju = vector.findPathByName("chungju");
        VectorDrawableCompat.VFullPath eumseong = vector.findPathByName("eumseong");
        VectorDrawableCompat.VFullPath jincheon = vector.findPathByName("jincheon");
        VectorDrawableCompat.VFullPath goeseong = vector.findPathByName("goeseong");
        VectorDrawableCompat.VFullPath jeungpyeong = vector.findPathByName("jeungpyeong");
        VectorDrawableCompat.VFullPath cheongju = vector.findPathByName("cheongju");
        VectorDrawableCompat.VFullPath boeun = vector.findPathByName("boeun");
        VectorDrawableCompat.VFullPath ogcheon = vector.findPathByName("ogcheon");
        VectorDrawableCompat.VFullPath youngdong = vector.findPathByName("youngdong");
        VectorDrawableCompat.VFullPath daejeon = vector.findPathByName("daejeon");
        VectorDrawableCompat.VFullPath sejong = vector.findPathByName("sejong");

        //충남 16
        VectorDrawableCompat.VFullPath cheonan = vector.findPathByName("cheonan");
        VectorDrawableCompat.VFullPath asan = vector.findPathByName("asan");
        VectorDrawableCompat.VFullPath yesan = vector.findPathByName("yesan");
        VectorDrawableCompat.VFullPath dangjin = vector.findPathByName("dangjin");
        VectorDrawableCompat.VFullPath seosan = vector.findPathByName("seosan");
        VectorDrawableCompat.VFullPath taean1 = vector.findPathByName("taean1");
        VectorDrawableCompat.VFullPath taean2 = vector.findPathByName("taean2");
        VectorDrawableCompat.VFullPath hongseong = vector.findPathByName("hongseong");
        VectorDrawableCompat.VFullPath cheongyang = vector.findPathByName("cheongyang");
        VectorDrawableCompat.VFullPath bolyeong = vector.findPathByName("bolyeong");
        VectorDrawableCompat.VFullPath buyeo = vector.findPathByName("buyeo");
        VectorDrawableCompat.VFullPath nonsan = vector.findPathByName("nonsan");
        VectorDrawableCompat.VFullPath geumsan = vector.findPathByName("geumsan");
        VectorDrawableCompat.VFullPath seocheon = vector.findPathByName("seocheon");
        VectorDrawableCompat.VFullPath gyelyong = vector.findPathByName("gyelyong");
        VectorDrawableCompat.VFullPath gongju = vector.findPathByName("gongju");

        //경북 23
        VectorDrawableCompat.VFullPath uljin = vector.findPathByName("uljin");
        VectorDrawableCompat.VFullPath bonghwa = vector.findPathByName("bonghwa");
        VectorDrawableCompat.VFullPath youngju = vector.findPathByName("youngju");
        VectorDrawableCompat.VFullPath yecheon = vector.findPathByName("yecheon");
        VectorDrawableCompat.VFullPath mungyeong = vector.findPathByName("mungyeong");
        VectorDrawableCompat.VFullPath sangju = vector.findPathByName("sangju");
        VectorDrawableCompat.VFullPath andong = vector.findPathByName("andong");
        VectorDrawableCompat.VFullPath yeongyang = vector.findPathByName("yeongyang");
        VectorDrawableCompat.VFullPath yeongdeog = vector.findPathByName("yeongdeog");
        VectorDrawableCompat.VFullPath cheongsong = vector.findPathByName("cheongsong");
        VectorDrawableCompat.VFullPath pohang = vector.findPathByName("pohang");
        VectorDrawableCompat.VFullPath gyeongju = vector.findPathByName("gyeongju");
        VectorDrawableCompat.VFullPath yeongcheon = vector.findPathByName("yeongcheon");
        VectorDrawableCompat.VFullPath gunwi = vector.findPathByName("gunwi");
        VectorDrawableCompat.VFullPath uiseong = vector.findPathByName("uiseong");
        VectorDrawableCompat.VFullPath gumi = vector.findPathByName("gumi");
        VectorDrawableCompat.VFullPath gincheon = vector.findPathByName("gincheon");
        VectorDrawableCompat.VFullPath chilgog = vector.findPathByName("chilgog");
        VectorDrawableCompat.VFullPath seongju = vector.findPathByName("seongju");
        VectorDrawableCompat.VFullPath golyeong = vector.findPathByName("golyeong");
        VectorDrawableCompat.VFullPath daegu = vector.findPathByName("daegu");
        VectorDrawableCompat.VFullPath gyeongsan = vector.findPathByName("gyeongsan");
        VectorDrawableCompat.VFullPath cheongdo = vector.findPathByName("cheongdo");

        //경남 22
        VectorDrawableCompat.VFullPath geochang = vector.findPathByName("geochang");
        VectorDrawableCompat.VFullPath hamyang = vector.findPathByName("hamyang");
        VectorDrawableCompat.VFullPath sancheong = vector.findPathByName("sancheong");
        VectorDrawableCompat.VFullPath habcheon = vector.findPathByName("habcheon");
        VectorDrawableCompat.VFullPath changnyeong = vector.findPathByName("changnyeong");
        VectorDrawableCompat.VFullPath milyang = vector.findPathByName("milyang");
        VectorDrawableCompat.VFullPath ulsan = vector.findPathByName("ulsan");
        VectorDrawableCompat.VFullPath uilyeong = vector.findPathByName("uilyeong");
        VectorDrawableCompat.VFullPath haman = vector.findPathByName("haman");
        VectorDrawableCompat.VFullPath gimhae = vector.findPathByName("gimhae");
        VectorDrawableCompat.VFullPath busan = vector.findPathByName("busan");
        VectorDrawableCompat.VFullPath cheongwon = vector.findPathByName("cheongwon");
        VectorDrawableCompat.VFullPath hadong = vector.findPathByName("hadong");
        VectorDrawableCompat.VFullPath jinju = vector.findPathByName("jinju");
        VectorDrawableCompat.VFullPath sacheon = vector.findPathByName("sacheon");
        VectorDrawableCompat.VFullPath kn_goseong = vector.findPathByName("kn_goseong");
        VectorDrawableCompat.VFullPath geoje = vector.findPathByName("geoje");
        VectorDrawableCompat.VFullPath namhae = vector.findPathByName("namhae");
        VectorDrawableCompat.VFullPath tongyeong1 = vector.findPathByName("tongyeong1");
        VectorDrawableCompat.VFullPath tongyeong2 = vector.findPathByName("tongyeong2");
        VectorDrawableCompat.VFullPath tongyeong3 = vector.findPathByName("tongyeong3");
        VectorDrawableCompat.VFullPath yangsan = vector.findPathByName("yangsan");

        //전북 15
        VectorDrawableCompat.VFullPath gunsan = vector.findPathByName("gunsan");
        VectorDrawableCompat.VFullPath igsan = vector.findPathByName("igsan");
        VectorDrawableCompat.VFullPath wanju1 = vector.findPathByName("wanju1");
        VectorDrawableCompat.VFullPath wanju2 = vector.findPathByName("wanju2");
        VectorDrawableCompat.VFullPath jinan = vector.findPathByName("jinan");
        VectorDrawableCompat.VFullPath muju = vector.findPathByName("muju");
        VectorDrawableCompat.VFullPath jangsu = vector.findPathByName("jangsu");
        VectorDrawableCompat.VFullPath jeonju = vector.findPathByName("jeonju");
        VectorDrawableCompat.VFullPath gimjae = vector.findPathByName("gimjae");
        VectorDrawableCompat.VFullPath imsil = vector.findPathByName("imsil");
        VectorDrawableCompat.VFullPath namwon = vector.findPathByName("namwon");
        VectorDrawableCompat.VFullPath sunchang = vector.findPathByName("sunchang");
        VectorDrawableCompat.VFullPath jeongeub = vector.findPathByName("jeongeub");
        VectorDrawableCompat.VFullPath buan = vector.findPathByName("buan");
        VectorDrawableCompat.VFullPath gochang = vector.findPathByName("gochang");


        //전남 23
        VectorDrawableCompat.VFullPath yeonggwang = vector.findPathByName("yeonggwang");
        VectorDrawableCompat.VFullPath jangseong = vector.findPathByName("jangseong");
        VectorDrawableCompat.VFullPath damyang = vector.findPathByName("damyang");
        VectorDrawableCompat.VFullPath gogseong = vector.findPathByName("gogseong");
        VectorDrawableCompat.VFullPath gulye = vector.findPathByName("gulye");
        VectorDrawableCompat.VFullPath gwangyang = vector.findPathByName("gwangyang");
        VectorDrawableCompat.VFullPath suncheon = vector.findPathByName("suncheon");
        VectorDrawableCompat.VFullPath yeosu = vector.findPathByName("yeosu");
        VectorDrawableCompat.VFullPath goheung = vector.findPathByName("goheung");
        VectorDrawableCompat.VFullPath boseong = vector.findPathByName("boseong");
        VectorDrawableCompat.VFullPath hwasun = vector.findPathByName("hwasun");
        VectorDrawableCompat.VFullPath biggwangju = vector.findPathByName("biggwangju");
        VectorDrawableCompat.VFullPath hampyeong = vector.findPathByName("hampyeong");
        VectorDrawableCompat.VFullPath naju = vector.findPathByName("naju");
        VectorDrawableCompat.VFullPath muan = vector.findPathByName("muan");
        VectorDrawableCompat.VFullPath sinan1 = vector.findPathByName("sinan1");
        VectorDrawableCompat.VFullPath sinan2 = vector.findPathByName("sinan2");
        VectorDrawableCompat.VFullPath mokpo = vector.findPathByName("mokpo");
        VectorDrawableCompat.VFullPath yeongam = vector.findPathByName("yeongam");
        VectorDrawableCompat.VFullPath jangheung = vector.findPathByName("jangheung");
        VectorDrawableCompat.VFullPath gangjin = vector.findPathByName("gangjin");
        VectorDrawableCompat.VFullPath haenam = vector.findPathByName("haenam");
        VectorDrawableCompat.VFullPath wando1 = vector.findPathByName("wando1");
        VectorDrawableCompat.VFullPath wando2 = vector.findPathByName("wando2");
        VectorDrawableCompat.VFullPath wando3 = vector.findPathByName("wando3");
        VectorDrawableCompat.VFullPath jindo = vector.findPathByName("jindo");


        //제주
        VectorDrawableCompat.VFullPath jeju = vector.findPathByName("jeju");

        //인천
        VectorDrawableCompat.VFullPath incheon = vector.findPathByName("incheon");
        VectorDrawableCompat.VFullPath kanghwado = vector.findPathByName("kanghwado");
        VectorDrawableCompat.VFullPath yeongjongdo = vector.findPathByName("yeongjongdo");

        jeju.setFillColor(getResources().getColor(android.R.color.holo_red_light));
        //jeju.setFillColor(Color.BLUE);
        //gangwon.setFillColor(Color.GREEN);

        ivKorea.invalidate();
    }
}