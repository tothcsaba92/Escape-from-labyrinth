# Escape-from-labyrinth
Challanging surviving game with junit tests

Luca Labirintusa

A labirintus, az útvesztő világszerte számos kultúrában jelen van, az őskortól napjainkig. Értelmezése az idők során alig változott: „helyiségek és folyosók bonyolult hálózata, ahol az elrendezésből adódóan nehézségekbe ütközik a tájékozódás és a kijutás.” Tágabb értelemben így nevezünk minden olyan állandó vagy mobil tetszés szerinti anyagból készült struktúrát, amelynek az alaprajza komplex és bonyolult.
Ahhoz, hogy egy ember bejusson egy labirintusba vagy kitaláljon belőle, mindig kiváló megfigyelő és tájékozódó képességre, a nehézségek leküzdésére való hajlamra és bizonyos időre volt szükség – márpedig ezekkel az adottságokkal minden ember más-más mértékben rendelkezik. 
(Wikipedia)

A feladatod a mai teszten az lesz, hogy implementálj egy labirintus-táblát, és kettő játékost, aki ki tud jutni a labirintusból.
A programot elkezdtük, megírtuk a szükséges interface-eket és néhány osztályt is. A te dolgod csak az, hogy befejezd. Figyelj rá, hogy miközben a feladatot megoldod, a projektben található interface-eket ne módosítsd! Megoldásod során nem kell felhasználói felületet készítened, és main metódusra se lesz szükséged, csak a unit testek futtatásával fogjuk ellenőrizni a munkád. A projekt tartalmaz egy unit tesztet (LabyrinthTest.java), ezzel tudod ellenőrizni a megoldásodat. A unit teszt futtatásához az adott fájlon csak egy jobbklikk > “Test file” opciót kell választanod. (Természetesen, ha szükséged van rá, írhatsz main metódust, de ez nem része a feladatnak, pont sem jár érte.)

(a leírás a következő oldalon folytatódik)
 
A labirintusokat fájlban tároljuk, a következő formátumban:
●	Az első sorban egy szám található, amely megadja a labirintus szélességét
●	A második sorban egy szám található, amely megadja a labirintus magasságát
●	Ez után pedig a labirintus leírása következik, cellánként. Például:
WWWWW
S W E
W W W
W   W
WWWWW
●	Itt a W a falat (WALL), a S és E karakterek a START és END cellát jelentik, míg a szóközök az üres cellákat.
●	A fenti példában a játékosnak a (0, 1) koordinátáról kell eljutnia a (4, 1) koordinátára). Belátható, hogy a következő lépéssorozattal ezt meg tudja tenni:
EAST, SOUTH, SOUTH, EAST, EAST, NORTH, NORTH, EAST.

5.	Készíts el egy random játékost, aki véletlenszerűen mozog a pályán (úgy, hogy azért falba ne ütközzön). Ehhez készíts egy új osztályt, és implementáld a Player interface-t!
Figyeld meg, hogy a Player implementáció nem tárolja, hogy hol tartózkodik a pályán, ez a Labyrinth felelőssége! A Player csupán a következő lépését adja meg.
Ellenőrizd megoldásod a LabyrinthTest 
private Player getRandomPlayerImpl()
metódusának megírásával és a teszt futtatásával!
(Csak olyan kicsi labirintussal teszteljük ezt a játékost, ahol egy random walk is általában legfeljebb néhány másodpercen belül kivezet a labirintusból.)


6.	Bizonyítható, hogy egy labirintusból mindig kijutunk, ha annak van kijárata, és az egyik kezünket (mindegy, hogy jobb vagy bal) a bejáratnál a mellettünk lévő falra rakjuk, és úgy megyünk végig a labirintuson, hogy nem engedjük el a falat – azaz mindig balra vagy jobbra tartunk, ahol elágazáshoz érkeztünk.
Valósítsd meg ez alapján a  játékost (készíts egy új osztályt, és implementáld a Player interface-t)! Válaszd ki, hogy a játékosod a bal kezét, vagy a jobb kezét “rakja a falra” (a kettő egyszerre nem fog menni), tehát hogy mindig balra vagy jobbra tart-e egy elágazásnál.WallFollower
Player

