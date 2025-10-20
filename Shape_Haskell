--定義ブロック
data Shape = Rectangle Double Double
           | Ellipse Double Double
           | Circle Double

-- Doubleは少数
-- |はorを意味する
-- Shapeは三つのデータ種を統括する型。4つとも、Haskellで用意された型
area(Rectangle width height) =width*height
area(Ellipse width height) =pi*width*height/4.0
area(Circle radius) =area (Ellipse (radius*2.0)(radius*2.0))
-- area(Ellipse width height) =pi*(width/2.0)*(height/2.0)　なら俺はこう書きたかった


--使用ブロック
main = let --定義ブロック
        r = Rectangle 5.0 8.0
        u = Ellipse 3.0 4.0
        v = Circle 3.0
        ss = [r, u, v] --それぞれをリストssに格納
       in --使用ブロック
        for (\s -> putStr("area: "++show (area s)++"\n")) ss
         -- ここの\s ->については第四章でラムダ項について説明した後に、第七章で説明するらしい
         -- //"\n"はリテラル
