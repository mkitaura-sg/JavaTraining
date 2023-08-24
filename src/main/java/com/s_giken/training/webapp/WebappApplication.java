package com.s_giken.training.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Spring Bootの起動クラス
 */
@SpringBootApplication
@EnableJpaAuditing
public class WebappApplication {
	/**
	 * Spring Bootの起動メソッド
	 * 
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}
}
