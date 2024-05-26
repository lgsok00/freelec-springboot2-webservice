package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter  // Getter 메서드 자동 생성
@NoArgsConstructor  // 기본 생성자 자동 추가
@Entity  // 테이블과 링크될 클래스
public class Posts {

  @Id  // PK 필드

  // @GeneratedValue = PK 생성 규칙
  // GenerationType.IDENTITY : auto_increment
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 500, nullable = false)
  private String title;

  @Column(columnDefinition = "TEXT", nullable = false)
  private String content;

  private String author;

  @Builder  // Builder 패턴 클래스 생성
  public Posts(String title, String content, String author) {
    this.title = title;
    this.content = content;
    this.author = author;
  }
}
