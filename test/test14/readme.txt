加拿大 亞伯達省的車牌目前是 ABC-0123 的格式(三個英文字母後面四個數字)。 

如果第一部分和第二部分的值差距在 100 以內我們稱這個車牌是 "nice" 的。 

第一部分的值是用26進位計算的(其字元為為[A..Z])。

舉例來說，如果第一部分是"ABC"，其值為28(0*26^2 + 1*26^1 + 2*26^0)，

所以這個車牌"ABC-0123"是 nice 的，因為|28-123|<=100。 

給定一個車牌號碼表，你的程式要能判斷車牌是不是 nice。

input:

50
APA-0963
BYC-0187
BPD-1674
BAI-1179
BBZ-0430
ATR-1336
ASZ-0868
BPH-1406
AOQ-1385
AAV-0857
BSM-0645
AZV-0588
BDJ-1438
BDM-1120
BWB-1799
AJZ-1363
BHO-0647
AZE-1985
BSS-0423
BAW-0050
AYF-1791
AZR-0675
AFC-0052
BIU-0286
BQK-0677
AAO-0142
BXP-0035
ANV-0045
AQU-0415
BJH-0524
BVW-0675
ATH-0733
BDO-1475
AOM-0204
BWA-1713
AMQ-0834
AHP-1425
ABM-0634
AGG-0192
ALQ-1851
AQX-1757
BHU-0193
ALE-1073
ATJ-1774
AGW-0622
BOR-1692
ALE-0971
BVK-0807
AUO-0033
BEB-0077

output
not nice
not nice
not nice
not nice
not nice
not nice
not nice
not nice
not nice
not nice
not nice
nice
not nice
not nice
not nice
not nice
not nice
not nice
not nice
not nice
not nice
nice
nice
not nice
not nice
not nice
not nice
not nice
nice
not nice
not nice
not nice
not nice
not nice
not nice
not nice
not nice
not nice
nice
not nice
not nice
not nice
not nice
not nice
not nice
not nice
not nice
not nice
not nice
not nice