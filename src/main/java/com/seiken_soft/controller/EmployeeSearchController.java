package com.seiken_soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeSearchController {

	public EmployeeSearchController() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	@RequestMapping(path = "/search", method = RequestMethod.POST)
	public String postMethod(@RequestParam("shainId") String shainId, @RequestParam("shainName") String shainName) {
        
		//検索ロジックを呼び出す処理
		
        return "";
    }

}
