# Chapter4アセスメント

## 試験概要

試験時間：120分

以下の説明を読み、各設問に解答し提出してください。

- 実装前に処理フローをコメントアウトで記述すること
- 実装完了後、自己採点（動作確認）を行うこと
- 自己採点完了後、次の設問に進むこと
- 全てのプログラムが実行可能であること
- コンパイルエラー状態での提出は禁止
- 出力内容やメソッド名が指示通りでない場合は不正解となる
- 実行時に`Build failed, do you want to continue.`という警告が出たときは`continue`を選択すると実行可能
- peopleData.csvを誤って上書きしたときは以下こコピーして利用してください。

```
Name,Age,Country,City,Food,Item1,Item2,Item3
Sarah,21,France,Paris,Macaron,Cigarette,Phone,Book
Emily,41,USA,Chicago,DeepDishPizza,Cigarette,Phone,Card
Francesco,71,Italy,Milan,Ossobuco,Cigarette,Wallet,Card
Liam,57,Canada,Montreal,SmokedMeatSandwich,Card,Wallet,Card
Hannah,35,Germany,Munich,Pretzel,Book,Phone,Card
Noah,48,Canada,Vancouver,NanaimoBar,Phone,Key,Cigarette
Louis,43,France,Paris,Croissant,Cigarette,Phone,Wallet
Olivia,48,Canada,Montreal,Bagel,Cigarette,Phone,Glasses
Emma,48,Germany,Munich,Weisswurst,Cigarette,Book,Phone
Emily,87,USA,LosAngeles,Sushi,Phone,Cigarette,Wallet
Rin,43,Japan,Tokyo,Sushi,Glasses,Cigarette,Cigarette
Kenji,75,Japan,Osaka,Takoyaki,Book,Cigarette,Book
Emily,40,USA,NewYork,Bagel,Key,Card,Key
Giulia,70,Italy,Naples,CapreseSalad,Book,Card,Phone
Sakura,64,Japan,Kyoto,Yuba,Cigarette,Glasses,Card
Emily,31,USA,LosAngeles,Sushi,Key,Glasses,Key
Max,23,Germany,Berlin,DnerKebab,Wallet,Key,Card
Kenji,39,Japan,Kyoto,Yuba,Key,Book,Phone
Sarah,71,USA,NewYork,Cheesecake,Phone,Glasses,Book
Ashley,73,USA,NewYork,Cheesecake,Book,Book,Wallet
Louis,74,France,Lyon,CoqauVin,Wallet,Wallet,Cigarette
Mia,31,Germany,Munich,Weisswurst,Glasses,Phone,Phone
Leon,71,Germany,Hamburg,Fischbrtchen,Book,Cigarette,Card
James,90,USA,LosAngeles,AvocadoToast,Glasses,Glasses,Glasses
Noah,59,Canada,Vancouver,Salmon,Glasses,Cigarette,Phone
Leo,53,France,Lyon,Quenelle,Book,Phone,Book
Benjamin,38,Canada,Vancouver,NanaimoBar,Book,Wallet,Card
Camille,32,France,Marseille,Bouillabaisse,Book,Card,Cigarette
Max,30,Germany,Hamburg,Labskaus,Glasses,Glasses,Cigarette
Sophia,69,Canada,Toronto,PeamealBacon,Cigarette,Key,Cigarette
Jessica,34,USA,LosAngeles,Tacos,Cigarette,Key,Phone
Leo,85,France,Lyon,CoqauVin,Key,Cigarette,Book
John,38,USA,Chicago,Popcorn,Key,Key,Key
Haruto,62,Japan,Osaka,Takoyaki,Wallet,Cigarette,Card
Sofia,69,Germany,Hamburg,Fischbrtchen,Book,Card,Key
Chloe,71,France,Lyon,Quenelle,Card,Book,Card
John,65,USA,LosAngeles,Tacos,Wallet,Cigarette,Glasses
Rin,45,Japan,Kyoto,Yuba,Card,Phone,Key
Sarah,49,USA,LosAngeles,Tacos,Phone,Cigarette,Cigarette
Camille,43,France,Marseille,Bouillabaisse,Key,Cigarette,Cigarette
Charlotte,73,Canada,Toronto,ButterTart,Glasses,Book,Phone
Yuki,40,Japan,Osaka,Kushikatsu,Book,Wallet,Wallet
Lukas,76,Germany,Munich,Weisswurst,Key,Book,Card
Robert,46,USA,NewYork,Bagel,Cigarette,Glasses,Card
Paul,27,Germany,Munich,Pretzel,Book,Glasses,Cigarette
Luca,21,Italy,Milan,Panettone,Key,Book,Glasses
Emma,49,Canada,Montreal,Bagel,Book,Cigarette,Book
Anna,70,Germany,Munich,Pretzel,Book,Book,Key
Kenji,67,Japan,Kyoto,MatchaSweets,Book,Phone,Glasses
Francesco,19,Italy,Naples,Pizza,Key,Wallet,Book
Alessandro,30,Italy,Milan,Risotto,Phone,Cigarette,Cigarette
Louis,35,France,Lyon,CoqauVin,Key,Cigarette,Glasses
Liam,73,Canada,Montreal,Bagel,Cigarette,Glasses,Key
Jessica,54,USA,Chicago,DeepDishPizza,Wallet,Phone,Wallet
Sarah,86,France,Lyon,SaladeLyonnaise,Phone,Phone,Book
Sofia,63,Germany,Berlin,Eisbein,Cigarette,Card,Cigarette
Miyu,49,Japan,Osaka,Takoyaki,Card,Glasses,Phone
Benjamin,76,Canada,Toronto,Poutine,Cigarette,Wallet,Card
Robert,51,USA,NewYork,Bagel,Book,Phone,Phone
Francesco,38,Italy,Naples,Sfogliatella,Wallet,Cigarette,Cigarette
Luca,37,Italy,Milan,Panettone,Key,Cigarette,Card
Alice,71,France,Lyon,Quenelle,Cigarette,Phone,Card
Sophia,55,Canada,Montreal,Bagel,Wallet,Wallet,Wallet
Sarah,29,USA,Chicago,ItalianBeef,Glasses,Phone,Card
Naomi,16,Japan,Osaka,Okonomiyaki,Cigarette,Cigarette,Phone
Hiroshi,68,Japan,Kyoto,KaisekiRyori,Phone,Key,Book
Camille,65,France,Marseille,Bouillabaisse,Book,Book,Book
Kenji,52,Japan,Tokyo,Ramen,Cigarette,Key,Card
Jessica,67,USA,LosAngeles,Sushi,Cigarette,Wallet,Key
Sophia,89,Canada,Toronto,ButterTart,Key,Wallet,Wallet
Ashley,42,USA,NewYork,HotDog,Glasses,Glasses,Book
Sarah,72,France,Paris,Baguette,Glasses,Key,Book
David,41,USA,Chicago,ItalianBeef,Cigarette,Glasses,Glasses
Olivia,44,Canada,Montreal,PoudingChmeur,Wallet,Glasses,Book
Kenji,54,Japan,Tokyo,Sushi,Glasses,Book,Key
Paul,72,Germany,Munich,Weisswurst,Cigarette,Glasses,Cigarette
Hannah,86,Germany,Berlin,DnerKebab,Key,Card,Key
Leo,61,France,Marseille,Bouillabaisse,Cigarette,Card,Cigarette
Davide,79,Italy,Milan,Panettone,Phone,Phone,Glasses
Olivia,74,Canada,Toronto,ButterTart,Wallet,Book,Book
Emma,63,Germany,Berlin,DnerKebab,Wallet,Glasses,Key
Louis,52,France,Lyon,SaladeLyonnaise,Glasses,Glasses,Phone
John,31,USA,LosAngeles,Tacos,Glasses,Cigarette,Glasses
Sarah,88,USA,LosAngeles,AvocadoToast,Book,Wallet,Book
David,28,USA,Chicago,ItalianBeef,Phone,Key,Cigarette
Liam,62,Canada,Vancouver,Salmon,Cigarette,Key,Book
Avery,48,Canada,Toronto,ButterTart,Phone,Phone,Wallet
Alessandro,87,Italy,Rome,Carbonara,Book,Key,Phone
Ashley,26,USA,Chicago,Popcorn,Card,Phone,Cigarette
Alice,25,France,Marseille,Navette,Phone,Phone,Wallet
Alice,83,France,Marseille,Navette,Card,Phone,Cigarette
Chiara,18,Italy,Milan,Panettone,Wallet,Wallet,Card
Finn,44,Germany,Berlin,Currywurst,Cigarette,Phone,Book
Sarah,76,USA,LosAngeles,Tacos,Glasses,Cigarette,Cigarette
Emma,49,France,Paris,Croissant,Book,Key,Cigarette
Michael,72,USA,LosAngeles,Tacos,Phone,Cigarette,Cigarette
Aurora,47,Italy,Rome,Carbonara,Glasses,Wallet,Cigarette
Charlotte,35,Canada,Vancouver,Salmon,Book,Key,Key
Alessandro,15,Italy,Rome,Carbonara,Glasses,Wallet,Cigarette
Sophia,32,Canada,Toronto,Poutine,Glasses,Book,Glasses
```





## 設問1:

### 目安時間

30分

### 設問

要件に従ってクラスの定義と処理の実装を行ってください。



#### クラスの定義

peopleData.csvのデータをマッピングするためのクラス・フィールド・コンストラクタ・アクセサを、以下要件に従って実装してください。

【要件】
**クラス**
`model`パッケージを新たに作成し、その中に`Person`クラスを実装すること

**フィールド**
以下の仕様でフィールドを実装すること

| アクセス修飾子 | フィールド名 | 型 | peopleDate.csvで対応するカラム |
| --- | --- | --- | --- |
| private | name | 文字列 | Name（名前） |
| private | age | 整数 | Age（年齢） |
| private | country | 文字列 | Country（国籍） |
| private | city | 文字列 | City（出身都市） |
| private | food | 文字列 | Food（好きな食べ物） |
| private | items | 文字列のリスト | Item1、Item2、Item3（所持品1,2,3） |

**コンストラクタ**
各フィールドを初期化するために、以下6つの引数を受け取れる1つのコンストラクタを実装する

| 引数の型・名前 | 説明 |
| --- | --- |
| 文字列・name | nameフィールドに代入する |
| 整数・age | ageフィールドに代入する |
| 文字列・country | countryフィールドに代入する |
| 文字列・city | cityフィールドに代入する |
| 文字列・food | foodフィールドに代入する |
| 文字列のリスト・items | itemsフィールドに代入する |

※引数の順番はname・age・country・city・food・itemsの順とする

**アクセサ（getter）**
以下の仕様に沿って、各フィールドに対応するgetterを実装する

| メソッド名 | 返り値の型 | 処理内容 |
| --- | --- | --- |
| getName | 文字列 | nameフィールドを返却する |
| getAge | 整数列 | ageフィールドを返却する |
| getCountry | 文字列 | countryフィールドを返却する |
| getCity | 文字列 | cityフィールドを返却する |
| getFood | 文字列 | foodフィールドを返却する |
| getItems | 文字列のリスト | itemsフィールドを返却する |

**アクセサ（setter）**
以下の仕様に沿って、各フィールドに対応するsetterを実装する

| メソッド名 | 引数の型・名前 | 返り値の型 | 処理内容 |
| --- | --- | --- | --- |
| setName | 文字列・name | なし | nameフィールドに代入する |
| setAge | 整数・age | なし | ageフィールドに代入する |
| setCountry | 文字列・country | なし | countryフィールドに代入する |
| setCity | 文字列・city | なし | cityフィールドに代入する |
| setFood | 文字列・food | なし | foodフィールドに代入する |
| setItems | 文字列のリスト・items | なし | itemsフィールドに代入する |


#### 処理の実装

`Person` オブジェクトを格納するリストを要件に従って `question1.Q1Execute.java` のメインメソッド内に宣言してください。

StreamAPIを使用して年齢が30歳以上の名前と年齢を出力して下さい。出力のフォーマットは出力結果を再現してください。

【要件】

型 : List

変数名 : `peopleList`

初期値 : 以下の3つの `Person` オブジェクトを初期値としたArrayListのインスタンス

| 名前     | 年齢 | 国籍   | 出身都市 | 好きな食べ物 | 所持品1,2,3             |
| -------- | ---- | ------ | -------- | ------------ | ----------------------- |
| Alice    | 18   | France | Paris    | Macaron      | Key, Phone, Card        |
| Benjamin | 69   | Canada | Montreal | Bagel        | Cigarette, Wallet, Book |
| Chiara   | 32   | Italy  | Rome     | Carbonara    | Glasses, Book, Card     |

出力結果

```
Benjamin, 69 years old
Chiara, 32 years old
```





## 設問2:

### 目安時間

40分

### 設問

要件に応じたメソッドを`question2.Q2Execute.java`にすべて実装してください。

各メソッドは実装後メインメソッド内で出力結果通りか動作確認を行ってください。

#### loadPeopleData

`peopleData.csv` のデータを `Person` オブジェクトにマッピングして `peopleList` に追加し、リストを返すように実装してください。

ファイルパスは定義済のフィールド`FILE_PATH`を利用してください。

出力結果

```
Sarah
Emily
Francesco
Liam
Hannah
Noah
Louis
Olivia
Emma
Emily
Rin
Kenji
Emily
Giulia
Sakura
Emily
Max
Kenji
Sarah
Ashley
Louis
Mia
Leon
James
Noah
Leo
Benjamin
Camille
Max
Sophia
Jessica
Leo
John
Haruto
Sofia
Chloe
John
Rin
Sarah
Camille
Charlotte
Yuki
Lukas
Robert
Paul
Luca
Emma
Anna
Kenji
Francesco
Alessandro
Louis
Liam
Jessica
Sarah
Sofia
Miyu
Benjamin
Robert
Francesco
Luca
Alice
Sophia
Sarah
Naomi
Hiroshi
Camille
Kenji
Jessica
Sophia
Ashley
Sarah
David
Olivia
Kenji
Paul
Hannah
Leo
Davide
Olivia
Emma
Louis
John
Sarah
David
Liam
Avery
Alessandro
Ashley
Alice
Alice
Chiara
Finn
Sarah
Emma
Michael
Aurora
Charlotte
Alessandro
Sophia
```



#### removeAndOutputNames

`peopleList` の中から先頭データをを1番目とした時、10番目から45番目の要素と55番目から85番目の要素を削除して、人物名を出力するメソッドです。

出力結果

```
Sarah
Emily
Francesco
Liam
Hannah
Noah
Louis
Olivia
Emma
Luca
Emma
Anna
Kenji
Francesco
Alessandro
Louis
Liam
Jessica
Liam
Avery
Alessandro
Ashley
Alice
Alice
Chiara
Finn
Sarah
Emma
Michael
Aurora
Charlotte
Alessandro
Sophia
```



#### printFormattedPeopleList

`peopleList` の中で、国籍の `USA` という文字列を `America` に変更し、先頭の25件分のデータを以下のフォーマットで出力するメソッドです。

このメソッドの実装にはStreamAPIを使用してください。

- 名前が `Mark` 、国籍が `USA` の場合

```
Mark was born in America
```

出力結果

```
Sarah was born in France
Emily was born in America
Francesco was born in Italy
Liam was born in Canada
Hannah was born in Germany
Noah was born in Canada
Louis was born in France
Olivia was born in Canada
Emma was born in Germany
Emily was born in America
Rin was born in Japan
Kenji was born in Japan
Emily was born in America
Giulia was born in Italy
Sakura was born in Japan
Emily was born in America
Max was born in Germany
Kenji was born in Japan
Sarah was born in America
Ashley was born in America
Louis was born in France
Mia was born in Germany
Leon was born in Germany
James was born in America
Noah was born in Canada
```



#### printNamesWithBook

`peopleList` の中から所持品に `Book` を含むデータのみを抽出し、名前を全て出力するメソッドです。

ただし、同じ名前は1度しか出力しません。

メソッドの実装にはStreamAPIを使用してください。

出力結果

```
Sarah
Hannah
Emma
Kenji
Giulia
Ashley
Leon
Leo
Benjamin
Camille
Sofia
Chloe
Charlotte
Yuki
Lukas
Paul
Luca
Anna
Francesco
Robert
Hiroshi
Olivia
Liam
Alessandro
Finn
Sophia
```



#### printNumberWithCigarette

`peopleList` の中から所持品に `Cigarette` を含むデータのみを抽出し、件数を以下の出力結果のフォーマットに沿って出力するメソッドです。

メソッドの実装にはStreamAPIを使用してください。

実装後はメインメソッド内で `printNumberWithCigarette` メソッドを呼出し、出力を確認してください。

- 出力結果

```
There are 51 smokers.
```



## 設問3:

### 目安時間

40分

### 設問

要件に応じたメソッドを`question3.Q3Execute.java`にすべて実装してください。

各メソッドは実装後メインメソッド内で出力結果やフォーマット通りか動作確認を行ってください。

#### loadPeopleData

設問2と同様に実装してください。

#### getKyotoFavoriteFoods

`Person` 型のオブジェクトのリストを引数として受け取り、その中から `Kyoto` を出身都市に持つ人が好きな食べ物の一覧を返します。

食べ物の一覧は Set 型とします。

- 出力結果(順不同)

```
Yuba
MatchaSweets
KaisekiRyori
```



#### getCityFoodMap

`Person` 型のオブジェクトのリストを引数として受け取り、各都市出身者の好きな食べ物をMapとして返します。

Mapのキーは都市名で、値はキーの都市を出身都市名に持つ人が好きな食べ物のSetです。

- フォーマット

```
都市名 : [食べ物1, 食べ物2, ...]
```



#### getCountryCityFoodMap

各国ごとの都市とその都市出身者に好まれる食べ物のMapを返すメソッド `getCountryCityFoodMap` を実装してください。

このメソッドは、 `Person` オブジェクトのリストを引数として受け取り、キーが国名、値にQ2で実装した `getCityFoodMap` メソッドの返り値であるMapを要素に持つMapを返却します。

- フォーマット

```
国名1 - 都市名1 : [食べ物1, 食べ物2, ...]
国名1 - 都市名2 : [食べ物1, 食べ物2, ...]
...
国名2 - 都市名1 : [食べ物1, 食べ物2, ...]
...
```



#### writeMapToCSV

`getCountryCityFoodMap`で作成した`getCountryCityFoodMap` の返り値のMapを利用してCSVファイルを作成します。

引数は、 `(String 出力ファイル名, Map getCountryCityFoodMap()の返り値)` とします。

エクスポート先は定義済のフィールド`EXPORT_PATH`を利用してください。

実装後はメインメソッド内で実行し、以下のCSVファイル `exportData.csv` が出力されることを確認してください。

**exportData.csv**

```
Country,City,Food1,Food2,Food3
Canada,Vancouver,NanaimoBar,Salmon,
Canada,Montreal,Bagel,SmokedMeatSandwich,PoudingChmeur
Canada,Toronto,Poutine,PeamealBacon,ButterTart
USA,Chicago,DeepDishPizza,ItalianBeef,Popcorn
USA,NewYork,Bagel,HotDog,Cheesecake
USA,LosAngeles,AvocadoToast,Tacos,Sushi
Japan,Tokyo,Ramen,Sushi,
Japan,Kyoto,Yuba,MatchaSweets,KaisekiRyori
Japan,Osaka,Okonomiyaki,Takoyaki,Kushikatsu
Italy,Milan,Risotto,Panettone,Ossobuco
Italy,Rome,Carbonara,,
Italy,Naples,Pizza,CapreseSalad,Sfogliatella
France,Marseille,Navette,Bouillabaisse,
France,Lyon,CoqauVin,Quenelle,SaladeLyonnaise
France,Paris,Baguette,Croissant,Macaron
Germany,Munich,Pretzel,Weisswurst,
Germany,Berlin,Currywurst,Eisbein,DnerKebab
Germany,Hamburg,Fischbrtchen,Labskaus,
```


