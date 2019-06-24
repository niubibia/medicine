package com.newer.medicine.controller;

import com.newer.medicine.domain.LoadImage;
import com.newer.medicine.service.LoadImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author wzl
 */

@Controller
@RequestMapping("/api")
public class LoadImageController {

    @Autowired
    private LoadImageService loadImageService;


    private LoadImage loadImage;

    @ResponseBody
    @GetMapping("/loadSell")
    public ResponseEntity<?> loadSell() {

        HashMap<String, ArrayList<BigDecimal>> hashMap = new HashMap<String, ArrayList<BigDecimal>>();
        ArrayList<BigDecimal> arrayList1 = new ArrayList<BigDecimal>();
        ArrayList<BigDecimal> arrayList2 = new ArrayList<BigDecimal>();
        ArrayList<BigDecimal> arrayList3 = new ArrayList<BigDecimal>();

        ArrayList<String> demo1 = new ArrayList<String>();
        demo1.add("2a503a5a-6a7e-4206-91e4-052f0c42f568");
        demo1.add("6eb8d4db-20d7-48b2-a2de-002992b51ade");
        demo1.add("d36cf6aa-f6ef-4e64-a12e-9dc2e91310f6");

        for(String s:demo1){
            for (int j = 1; j < 13; j++) {
                if(s.equals("2a503a5a-6a7e-4206-91e4-052f0c42f568")){
                    loadImage = loadImageService.loadSell(j,s);
                    if(loadImage!=null){
                        arrayList1.add(loadImage.getPrice());
                    }else{
                        arrayList1.add(BigDecimal.valueOf(0));
                    }
                }else if(s.equals("6eb8d4db-20d7-48b2-a2de-002992b51ade")){
                    loadImage = loadImageService.loadSell(j,s);
                    if(loadImage!=null){
                        arrayList2.add(loadImage.getPrice());
                    }else{
                        arrayList2.add(BigDecimal.valueOf(0));
                    }
                }else{
                    loadImage = loadImageService.loadSell(j,s);
                    if(loadImage!=null){
                        arrayList3.add(loadImage.getPrice());
                    }else{
                        arrayList3.add(BigDecimal.valueOf(0));
                    }
                }
            }
        }

        hashMap.put("annex1", arrayList1);
        hashMap.put("annex2", arrayList2);
        hashMap.put("annex3", arrayList3);

        return new ResponseEntity<>(hashMap, HttpStatus.OK);

    }

    @ResponseBody
    @GetMapping("/loadPay")
    public ResponseEntity<?> loadPay(){
        HashMap<String, ArrayList<BigDecimal>> hashMap = new HashMap<String, ArrayList<BigDecimal>>();
        ArrayList<BigDecimal> arrayList1 = new ArrayList<BigDecimal>();
        ArrayList<BigDecimal> arrayList2 = new ArrayList<BigDecimal>();
        ArrayList<BigDecimal> arrayList3 = new ArrayList<BigDecimal>();

        ArrayList<String> demo1 = new ArrayList<String>();
        demo1.add("2a503a5a-6a7e-4206-91e4-052f0c42f568");
        demo1.add("6eb8d4db-20d7-48b2-a2de-002992b51ade");
        demo1.add("d36cf6aa-f6ef-4e64-a12e-9dc2e91310f6");

        for(String s:demo1){
            for (int j = 1; j < 13; j++) {
                if(s.equals("2a503a5a-6a7e-4206-91e4-052f0c42f568")){
                    loadImage = loadImageService.loadPay(j,s);
                    if(loadImage!=null){
                        arrayList1.add(loadImage.getPrice());
                    }else{
                        arrayList1.add(BigDecimal.valueOf(0));
                    }
                }else if(s.equals("6eb8d4db-20d7-48b2-a2de-002992b51ade")){
                    loadImage = loadImageService.loadPay(j,s);
                    if(loadImage!=null){
                        arrayList2.add(loadImage.getPrice());
                    }else{
                        arrayList2.add(BigDecimal.valueOf(0));
                    }
                }else{
                    loadImage = loadImageService.loadPay(j,s);
                    if(loadImage!=null){
                        arrayList3.add(loadImage.getPrice());
                    }else{
                        arrayList3.add(BigDecimal.valueOf(0));
                    }
                }
            }
        }

        hashMap.put("annex1", arrayList1);
        hashMap.put("annex2", arrayList2);
        hashMap.put("annex3", arrayList3);

        return new ResponseEntity<>(hashMap, HttpStatus.OK);
    }

}
