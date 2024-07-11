package com.jieun.tour_map_groovy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.devs.vectorchildfinder.VectorChildFinder;
import com.devs.vectorchildfinder.VectorDrawableCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    VectorDrawableCompat.VFullPath dressPath;
    String local, visited, color;
    int visitCnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView ivKorea = findViewById(R.id.map);



        VectorChildFinder vector = new VectorChildFinder(this, R.drawable.map, ivKorea);


       // Log.d("TAG", "onCreate: rltdlfmaqusrud");

        //tjdnf
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

        /*
        String[] colorRand = getResources().getStringArray(R.array.colorRand);
        Random random = new Random();
        int n = random.nextInt(colorRand.length-1);
        color = "R.color." + colorRand[n]+"1";
        int colorInt = Integer.parseInt(color);*/

        /*int [] colorArray = {R.color.pink, R.color.skyblue, R.color.purple, R.color.yellow};
        Random random = new Random();
        int randomColorIndex = random.nextInt(colorArray.length);
        int randomColorResId = colorArray[randomColorIndex];

        int randomColor = ContextCompat.getColor(MainActivity.this, randomColorResId);
        Log.d("색","색상 위치" + randomColor);*/


        jeju.setFillColor(colorRC());

        Log.d("색칠","색상 위치" + colorRC()+5);

        //jeju.setFillColor(getResources().getColor(randomColorResId));
        //jeju.setFillColor(R.color.purple5);

        /*ivKorea.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    float x = event.getX();
                    float y = event.getY();

                    // 터치한 좌표를 기준으로 특정 VFullPath 객체의 영역을 판별하고 처리
                    if (isPointInsidePath(x, y, visited)) {
                        // path1에 해당하는 영역을 터치했을 때 처리할 로직


                    }
                }
                return true;
            }
        });*/

        //랜덤 함수 써서 위치 뽑기

        //뽑은 위치에 대한 처리문
        //근데 방문 했다는 걸 어떻게 인증 할거임? 인증하게 할거임?
        switch (visited){

            //서울1
            case "seoul":
                seoul.setFillColor(colorRC());
                break;

            //강원도
            case "kw_goseong" :
                kw_goseong.setFillColor(colorRC());
                break;
            case "sokcho" :
                sokcho.setFillColor(colorRC());
                break;
            case "yangyang":
                yangyang.setFillColor(colorRC());
                break;

            case "injae":
                injae.setFillColor(colorRC());
                break;
            case "yanggu" :
                yanggu.setFillColor(colorRC());
                break;
            case "gangneung" :
                gangneung.setFillColor(colorRC());
                break;
            case "donghae" :
                donghae.setFillColor(colorRC());
                break;
            case "samcheok" :
                samcheok.setFillColor(colorRC());
                break;
            case "taebeak" :
                taebeak.setFillColor(colorRC());
                break;
            case "jeongseon" :
                jeongseon.setFillColor(colorRC());
                break;
            case "pyeongchang" :
                pyeongchang.setFillColor(colorRC());
                break;
            case "hongcheon" :
                hongcheon.setFillColor(colorRC());
                break;
            case "hoengseong" :
                hoengseong.setFillColor(colorRC());
                break;
            case "wonju" :
                wonju.setFillColor(colorRC());
                break;
            case "yeongwol" :
                yeongwol.setFillColor(colorRC());
                break;
            case "hwacheon" :
                hwacheon.setFillColor(colorRC());
                break;
            case "cheorwon" :
                cheorwon.setFillColor(colorRC());
                break;
            case "chuncheon" :
                chuncheon.setFillColor(colorRC());
                break;

            //경기도
            case "yeoncheon" :
                yeoncheon.setFillColor(colorRC());
                break;
            case "pocheon" :
                pocheon.setFillColor(colorRC());
                break;
            case "gapyeong" :
                gapyeong.setFillColor(colorRC());
                break;
            case "yangpyeong" :
                yangpyeong.setFillColor(colorRC());
                break;
            case "yeoju" :
                yeoju.setFillColor(colorRC());
                break;
            case "icheon" :
                icheon.setFillColor(colorRC());
                break;
            case "gwangju" :
                gwangju.setFillColor(colorRC());
                break;
            case "namyangju" :
                namyangju.setFillColor(colorRC());
                break;
            case "hanam" :
                hanam.setFillColor(colorRC());
                break;
            case "guli" :
                guli.setFillColor(colorRC());
                break;
            case "uijeongbu" :
                uijeongbu.setFillColor(colorRC());
                break;
            case "yangju" :
                yangju.setFillColor(colorRC());
                break;
            case "dongducheon" :
                dongducheon.setFillColor(colorRC());
                break;
            case "paju" :
                paju.setFillColor(colorRC());
                break;
            case "goyang" :
                goyang.setFillColor(colorRC());
                break;
            case "gimpo" :
                gimpo.setFillColor(colorRC());
                break;
            case "bucheon" :
                bucheon.setFillColor(colorRC());
                break;
            case "gwangmyeong" :
                gwangmyeong.setFillColor(colorRC());
                break;
            case "siheung" :
                siheung.setFillColor(colorRC());
                break;
            case "ansan" :
                ansan.setFillColor(colorRC());
                break;
            case "gunpo" :
                gunpo.setFillColor(colorRC());
                break;
            case "anyang" :
                anyang.setFillColor(colorRC());
                break;
            case "uiwang" :
                uiwang.setFillColor(colorRC());
                break;
            case "gwacheon" :
                gwacheon.setFillColor(colorRC());
                break;
            case "seongnam" :
                seongnam.setFillColor(colorRC());
                break;
            case "suwon" :
                suwon.setFillColor(colorRC());
                break;
            case "hwaseong" :
                hwaseong.setFillColor(colorRC());
                break;
            case "pyeongtaeg" :
                pyeongtaeg.setFillColor(colorRC());
                break;
            case "ansung" :
                ansung.setFillColor(colorRC());
                break;
            case "yongin" :
                yongin.setFillColor(colorRC());
                break;
            case "osan" :
                osan.setFillColor(colorRC());
                break;



            //충북
            case "danyang" :
                danyang.setFillColor(colorRC());
                break;
            case "jecheon" :
                jecheon.setFillColor(colorRC());
                break;
            case "chungju" :
                chungju.setFillColor(colorRC());
                break;
            case "eumseong" :
                eumseong.setFillColor(colorRC());
                break;
            case "jincheon" :
                jincheon.setFillColor(colorRC());
                break;
            case "goeseong" :
                goeseong.setFillColor(colorRC());
                break;
            case "jeungpyeong" :
                jeungpyeong.setFillColor(colorRC());
                break;
            case "cheongju" :
                cheongju.setFillColor(colorRC());
                break;
            case "boeun" :
                boeun.setFillColor(colorRC());
                break;
            case "ogcheon" :
                ogcheon.setFillColor(colorRC());
                break;
            case "youngdong" :
                youngdong.setFillColor(colorRC());
                break;
            case "daejeon" :
                daejeon.setFillColor(colorRC());
                break;
            case "sejong" :
                sejong.setFillColor(colorRC());
                break;

            //충남
            case "cheonan" :
                cheonan.setFillColor(colorRC());
                break;
            case "asan" :
                asan.setFillColor(colorRC());
                break;
            case "yesan" :
                yesan.setFillColor(colorRC());
                break;
            case "dangjin" :
                dangjin.setFillColor(colorRC());
                break;
            case "seosan" :
                seosan.setFillColor(colorRC());
                break;
            case "taean" :
                taean1.setFillColor(colorRC());
                taean2.setFillColor(colorRC());
                break;
            case "hongseong" :
                hongseong.setFillColor(colorRC());
                break;
            case "cheongyang" :
                cheongyang.setFillColor(colorRC());
                break;
            case "bolyeong" :
                bolyeong.setFillColor(colorRC());
                break;
            case "buyeo" :
                buyeo.setFillColor(colorRC());
                break;
            case "nonsan" :
                nonsan.setFillColor(colorRC());
                break;
            case "geumsan" :
                geumsan.setFillColor(colorRC());
                break;
            case "seocheon" :
                seocheon.setFillColor(colorRC());
                break;
            case "gyelyong" :
                gyelyong.setFillColor(colorRC());
                break;
            case "gongju" :
                gongju.setFillColor(colorRC());
                break;

            //경북
            case "uljin" :
                uljin.setFillColor(colorRC());
                break;
            case "bonghwa" :
                bonghwa.setFillColor(colorRC());
                break;
            case "youngju" :
                youngju.setFillColor(colorRC());
                break;
            case "yecheon" :
                yecheon.setFillColor(colorRC());
                break;
            case "mungyeong" :
                mungyeong.setFillColor(colorRC());
                break;
            case "sangju" :
                sangju.setFillColor(colorRC());
                break;
            case "andong" :
                andong.setFillColor(colorRC());
                break;
            case "yeongyang" :
                yeongyang.setFillColor(colorRC());
                break;
            case "yeongdeog" :
                yeongdeog.setFillColor(colorRC());
                break;
            case "cheongsong" :
                cheongsong.setFillColor(colorRC());
                break;
            case "pohang" :
                pohang.setFillColor(colorRC());
                break;
            case "gyeongju" :
                gyeongju.setFillColor(colorRC());
                break;
            case "yeongcheon" :
                yeongcheon.setFillColor(colorRC());
                break;
            case "gunwi" :
                gunwi.setFillColor(colorRC());
                break;
            case "uiseong" :
                uiseong.setFillColor(colorRC());
                break;
            case "gumi" :
                gumi.setFillColor(colorRC());
                break;
            case "gincheon" :
                gincheon.setFillColor(colorRC());
                break;
            case "chilgog" :
                chilgog.setFillColor(colorRC());
                break;
            case "seongju" :
                seongju.setFillColor(colorRC());
                break;
            case "golyeong" :
                golyeong.setFillColor(colorRC());
                break;
            case "daegu" :
                daegu.setFillColor(colorRC());
                break;
            case "gyeongsan" :
                gyeongsan.setFillColor(colorRC());
                break;
            case "cheongdo" :
                cheongdo.setFillColor(colorRC());
                break;

            //경남
            case "geochang" :
                geochang.setFillColor(colorRC());
                break;
            case "hamyang" :
                hamyang.setFillColor(colorRC());
                break;
            case "sancheong" :
                sancheong.setFillColor(colorRC());
                break;
            case "habcheon" :
                habcheon.setFillColor(colorRC());
                break;
            case "changnyeong" :
                changnyeong.setFillColor(colorRC());
                break;
            case "milyang" :
                milyang.setFillColor(colorRC());
                break;
            case "ulsan" :
                ulsan.setFillColor(colorRC());
                break;
            case "uilyeong" :
                uilyeong.setFillColor(colorRC());
                break;
            case "haman" :
                haman.setFillColor(colorRC());
                break;
            case "gimhae" :
                gimhae.setFillColor(colorRC());
                break;
            case "busan" :
                busan.setFillColor(colorRC());
                break;
            case "cheongwon" :
                cheongwon.setFillColor(colorRC());
                break;
            case "hadong" :
                hadong.setFillColor(colorRC());
                break;
            case "jinju" :
                jinju.setFillColor(colorRC());
                break;
            case "sacheon" :
                sacheon.setFillColor(colorRC());
                break;
            case "kn_goseong" :
                kn_goseong.setFillColor(colorRC());
                break;
            case "geoje" :
                geoje.setFillColor(colorRC());
                break;
            case "namhae" :
                namhae.setFillColor(colorRC());
                break;
            case "tongyeong" :
                tongyeong1.setFillColor(colorRC());
                tongyeong2.setFillColor(colorRC());
                tongyeong3.setFillColor(colorRC());
                break;
            case "yangsan" :
                yangsan.setFillColor(colorRC());
                break;

            //전북
            case "gunsan" :
                gunsan.setFillColor(colorRC());
                break;
            case "igsan" :
                igsan.setFillColor(colorRC());
                break;
            case "wanju" :
                wanju1.setFillColor(colorRC());
                wanju2.setFillColor(colorRC());
                break;
            case "jinan" :
                jinan.setFillColor(colorRC());
                break;
            case "muju" :
                muju.setFillColor(colorRC());
                break;
            case "jangsu" :
                jangsu.setFillColor(colorRC());
                break;
            case "jeonju" :
                jeonju.setFillColor(colorRC());
                break;
            case "gimjae" :
                gimjae.setFillColor(colorRC());
                break;
            case "imsil" :
                imsil.setFillColor(colorRC());
                break;
            case "namwon" :
                namwon.setFillColor(colorRC());
                break;
            case "sunchang" :
                sunchang.setFillColor(colorRC());
                break;
            case "jeongeub" :
                jeongeub.setFillColor(colorRC());
                break;
            case "buan" :
                buan.setFillColor(colorRC());
                break;
            case "gochang" :
                gochang.setFillColor(colorRC());
                break;

                //전남
            case "yeonggwang" :
                yeonggwang.setFillColor(colorRC());
                break;
            case "jangseong" :
                jangseong.setFillColor(colorRC());
                break;
            case "damyang" :
                damyang.setFillColor(colorRC());
                break;
            case "gogseong" :
                gogseong.setFillColor(colorRC());
                break;
            case "gulye" :
                gulye.setFillColor(colorRC());
                break;
            case "gwangyang" :
                gwangyang.setFillColor(colorRC());
                break;
            case "suncheon" :
                suncheon.setFillColor(colorRC());
                break;
            case "yeosu" :
                yeosu.setFillColor(colorRC());
                break;
            case "goheung" :
                goheung.setFillColor(colorRC());
                break;
            case "boseong" :
                boseong.setFillColor(colorRC());
                break;
            case "hwasun" :
                hwasun.setFillColor(colorRC());
                break;
            case "biggwangju" :
                biggwangju.setFillColor(colorRC());
                break;
            case "hampyeong" :
                hampyeong.setFillColor(colorRC());
                break;
            case "naju" :
                naju.setFillColor(colorRC());
                break;
            case "muan" :
                muan.setFillColor(colorRC());
                break;
            case "sinan1" :
                sinan1.setFillColor(colorRC());
                sinan2.setFillColor(colorRC());
                break;
            case "mokpo" :
                mokpo.setFillColor(colorRC());
                break;
            case "yeongam" :
                yeongam.setFillColor(colorRC());
                break;
            case "jangheung" :
                jangheung.setFillColor(colorRC());
                break;
            case "gangjin" :
                gangjin.setFillColor(colorRC());
                break;
            case "haenam" :
                haenam.setFillColor(colorRC());
                break;
            case "wando" :
                wando1.setFillColor(colorRC());
                wando2.setFillColor(colorRC());
                wando3.setFillColor(colorRC());
                break;
            case "jindo" :
                jindo.setFillColor(colorRC());
                break;

                //제주
            case "jeju" :
                jeju.setFillColor(colorRC());
                break;

            case "incheon" :
                incheon.setFillColor(colorRC());
                break;
            case "kanghwado" :
                kanghwado.setFillColor(colorRC());
                break;
            case "yeongjongdo" :
                yeongjongdo.setFillColor(colorRC());
                break;





        }


        //jeju.setFillColor(getResources().getColor(R.color.yellow5));
        //jeju.setFillColor(Color.BLUE);
        //gangwon.setFillColor(Color.GREEN);

        ivKorea.invalidate();
    }

    public int colorRC(){
        int [] colorArray = {R.color.pink, R.color.skyblue, R.color.purple, R.color.yellow};
        Random random = new Random();
        int randomColorIndex = random.nextInt(colorArray.length);
        int randomColorResId = colorArray[randomColorIndex];

        int randomColor = ContextCompat.getColor(MainActivity.this, randomColorResId);
        return randomColor;
    }
}