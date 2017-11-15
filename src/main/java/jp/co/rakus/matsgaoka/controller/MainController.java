package jp.co.rakus.matsgaoka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	
	/**
	 * topページ遷移.
	 * @return topページ
	 */
	@RequestMapping("/")
	public String index() {
		return "top";
	}
	
	/**
	 * 院内紹介ページ.
	 * @return 院内紹介
	 */
	@RequestMapping("/intro")
	public String introductionPage() {
		return "introduction";
	}
	
	@RequestMapping("/schedule")
	public String schedulePage() {
		return "schedule";
	}
}
