package com.s_giken.training.webapp.model;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // エンティティクラスであることを示す
@EntityListeners(AuditingEntityListener.class)
@Table(name = "T_MEMBER") // 対応するデータベーステーブル名
@Data // メンバー変数に対するゲッター・セッターを自動生成
@NoArgsConstructor // 引数のないコンストラクタを自動生成
@AllArgsConstructor // 全てのメンバ変数に対する引数を持つコンストラクタを自動生成
public class Member {
    @Id // 主キーを設定
    @GeneratedValue(strategy = GenerationType.AUTO) // 主キーの採番方法を指定
    @Column(name = "member_id") // 対応する列名
    private int memberId;

    @Column(name = "mail") // 対応する列名
    @NotNull // null不可
    @NotBlank // 空文字不可
    private String mail;

    @Column(name = "name") // 対応する列名
    @NotNull // null不可
    @NotBlank // 空文字不可
    private String name;

    @Column(name = "address") // 対応する列名
    @NotNull // null不可
    private String address;

    @Column(name = "start_date") // 対応する列名
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 日付のフォーマットを指定
    @NotNull // null不可
    private Date startDate;

    @Column(name = "end_date") // 対応する列名
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 日付のフォーマットを指定
    private Date endDate;

    @Column(name = "payment_method") // 対応する列名
    @NotNull // null不可
    private int paymentMethod;

    @CreatedDate // 作成日時を自動設定
    private Timestamp createdDate;

    @LastModifiedDate // 更新日時を自動設定
    private Timestamp updatedDate;
}
