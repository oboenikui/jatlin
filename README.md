# Jatlin

このリポジトリは [ブログ記事](https://www.m3tech.blog/entry/2021-12-06-kotlin-like-java) のためのサンプルコードです。詳細は記事をご覧ください。

## プロジェクト構成

`:java-lib` にKotlinに偽装したJavaファイルが含まれます。
`:kotlin-lib` は `:java-lib` をビルドしたJARファイルをKotlinから読み込んで実行することを確認するためのサブモジュールです。

## ビルド & 実行

```bash
$ ./gradlew :java-lib:copyJar
```

でJARをビルド後、IntelliJ IDEAの場合は "Reload All Gradle Projects" をした上で `Main.kt` を実行してください。