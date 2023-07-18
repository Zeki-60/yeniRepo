package armut;

public class Armut {
    public static void main(String[] args) {
        String dizi[] = {"pick", "toplamak", "plant", "bitki", "plate", "tabak", "borrow", "ödünç almak", "brave", "cesur", "calendar", "takvim", "carpenter", "marangoz", "carry", "taşımak", "church", "kilise", "coat", "ceket", "daily", "günlük", "dirty", "kirli", "eraser", "silgi", ".", ".", ".", ".", "habit", "alışkanlık", "engaged", "nişanlı", "enough", "yeterli", "conversation", "sohbet", "seat", "oturmak", "glad", "memnun", "lots", "çok", "sure", "elbette", "graduate", "mezun olmak", "busy", "meşgul", ".", ".", "these", "bunların", ".", ".", "neighbour", "komşu", "nose", "burun", "opposite", "zıt", "pet", "evcil hayvan", "pocket", "cep", "polite", "kibar", "push", "itmek", "river", "ırmak", "road", "yol", "rose", "gül", "shelf", "raf", "ship", "gemi", "shirt", "gömlek", "shoe", "ayakkabı", "sick", "hasta", "sky", "gökyüzü", "spoon", "kaşık", "thirsty", "susamış", "tidy", "düzenlemek", "town", "kasaba", "underwear", "iç çamaşırı", "wind", "rüzgar", "abroad", "yurtdışı", "accept", "kabul etmek", "accident", "kaza", "anniversary", "yıl dönümü", "ant", "karınca", "argue", "tartışmak", "bell", "zil", "bite", "ısırmak", "cap", "kasket", "catch", "yakalamak", "chance", "şans", "chess", "satranç", "climb", "tırmanmak", "collect", "toplamak", "confused", "kafası karışık", "connect", "bağlanmak", ".", ".", "refrigerator", "buzdolabı", "arm", "kol", "rent", "kiralamak", "repair", "tamir etmek", "restroom", "tuvalet", "rice", "pirinç", "ring", "yüzük", "heart", "kalp", "horror", "korku", "large", "geniş", "laugh", "gülmek", "lend", "ödünç vermek", "letter", "mektup", "meal", "yemek", "miss", "özlemek", "mistake", "hata", "between", "arasında", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "cave", "mağara", "bias", "ön yargı", "blade", "bıçak", "cheerful", "neşeli", "chestnut", "kestane", "chilly", "soğuk", "chimney", "baca", "choke", "boğmak", "afraid", "korkmuş", "alone", "yalnız", "answer", "cevap vermek",
                // ilk 100
                "bill", "hesap", "boil", "kaynama", "cease", "durdurmak", "celebration", "kutlama", "chapter", "bölüm", "charity", "yardım severlik", "chose", "kovalamak", "cheeky", "yüzsüz", "bawl", "bağırmak", "their", "onların", "kind", "kibar", "rich", "zengin", "far", "uzak", "unemployed", "işsiz", "freelancer", "serbest çalışan", "soldier", "asker", "grocer", "bakkal", "surgeon", "cerrah", "floris", "çiçekçi", "locksmith", "çilingir", "shepherd", "çoban", "priest", "papaz", "tailor", "terzi", "sailor", "denizci", "chemist", "eczacı", "baker", "fırıncı", "retired", "emekli", "to", "-e doğru", "make", "yapmak", "say", "söylemek", "get", "almak", "take", "almak", "give", "vermek", "leave", "ayrılmak", "put", "koymak", "keep", "tutmak", "let", "izin vermek", "believe", "inanmak", "consider", "değerlendirmek", "apear", "görünmek", "expect", "beklemek", "stay", "kalmak", "fall", "düşmek", "...........", ".............", "turn on", "açmak", "worry", "endişe etmek", "thick", "kalın", "thin", "ince", "narrow", "dar", "often", "sık sık", "hurry", "acele etmek", "company", "şirket", "member", "üye", "...........", "..............", "reason", "neden", "for her family", "ailesi için", "regret", "pişmanlık", "noon", "öğle vakti", "sunrise", "gün doğumu", "midnight", "gece yarısı", "ill", "hasta", "thinks", "düşünüyor", "us", "biz", "bought", "satın almak", "ı think", "bence", "beans", "fasulye", "cabbage", "lahana", "carrot", "havuç", "chili", "acı biber", "garlic", "sarımsak", "lettuce", "marul", "prickly", "dikenli", "quince", "ayva", "peaceful", "huzurlu", "flat", "daire", "yard", "bahçe", "pool", "havuz", "gate", "bahçe kapısı", "floor", "zemin", "wall", "duvar", "hallway", "koridor", "living room", "oturma odası", "cooker", "ocak", "oven", "fırın", "desk", "çalışma masası", "tub", "küvet", "tup", "musluk", "............", "............", "towel", "havlu", "knife", "bıçak", "...........", "...........", "............", "..........", ".............", "...............", "only", "sadece", "also", "ayrıca", "pollution", "kirlilik", "comment", "yorum", "half", "yarım", "foreign", "yabancı", "sales", "satış",
                //200
                "support", "destek","utilize", "yararlanmak", "order", "emir-sipariş", "preference", "tercih", "passionate", "tutkulu", "enthusiastic", "hevesli", "wave", "dalga", "feature", "özellik", "emphasis", "vurgu", "fabulous", "harika", "fresh", "taze", "variety", "çeşitlilik", "...............", ".............", "preparation", "hazırlık", "task", "görev", "allocation", "tahsis", "apprentice", "çırak", "promoted", "terfi", "scales", "terazi", "snack", "abur cubur", "disruption", "bozulma", "instructor", "eğitmen", "...............", "............", "exceptional", "olağanüstü", "implement", "uygulamak", "individual", "bireysel", "punctual", "dakik", "wonder", "merak etmek", "available", "mevcut", "certainly", "kesinlikle", "whole", "tüm", "upcoming", "yaklaşan", "bother", "dert", "intent", "niyet", "confident", "özgüvenli", "interest", "faiz", "particularly", "özellikle","especially","özellikle", "..............", ".............", "piece", "parça", "persuasion", "ikna", "whether", "ikisinden biri", "necessary", "gerekli", "modest", "mütevazı", "consumer", "tüketici", "dull", "sıkıcı", "investment", "yatırım", "invention", "buluş", "sell", "satmak", "almost", "neredeyse", "however", "fakat", "trust", "güven", "profitable", "karlı", "honest", "dürüst", "juggling", "hokkabazlık", "pottery", "çömlekçilik", "waste", "atık", "claim", "iddia", "journey", "seyahat", "soul", "ruh", "satisfy", "tatmin etmek", "explain", "açıklamak", "burn", "yakmak", "disabled", "engelli", "village", "köy", "stage", "sahne", "effort", "çaba", "act", "davranmak", "right now", "şu anda", "in front of", "önünde", "yelling", "bağırmak", "same", "aynı", "nowadays", "bu aralar", "abolish", "iptal etmek", "abuse", "kötüye kullanmak", "accent", "şive", "access", "giriş", "accumulate", "biriktirmek", "accused", "sanık", "accustom", "alıştırmak", "bucket", "kova", "brow", "alın", "bride", "gelin", "bribe", "rüşvet", "breast", "göğüs", "brake", "fren", "admission", "kabul", "adverse", "zıt", "alter", "değiştirmek", "ally", "anlaşma", "amend", "düzenleme", "ample", "geniş", "contact", "irtibata geçmek", "...........", ".............", "cotton", "pamuk", "cough", "öksürmek", "curious", "meraklı", "cute", "şirin", "decide", "karar vermek", "describe", "tanımlamak",
                //300
                "direction", "yön vermek", "discover", "keşfetmek", "discuss", "tartışmak","distrub", "rahatsız etmek", "drawer", "çekmece", "earring", "küpe", "elbow", "dirsek", "elevator", "asansör", "entertainment", "eğlence", "equal", "eşit", "escape", "çıkış/kaçış", "exhausted", "çok yorgun", "experience", "deneyim", "eyebrow", "kaş", "eyelash", "kirpik", "eyelid", "göz kapağı", "feel", "hissetmek", "female", "kadın", "finger", "parmak", "finish", "bitirmek", "fire", "ateş", "flight", "uçuş", "float", "şamandıra", "flower", "çiçek", "food", "yemek", "foot", "ayak", "fork", "çatal", "freedom", "özgürlük", "friend", "arkadaş", "frown", "kaş çatmak", ".............", "............", "fun", "eğlence", "furniture", "mobilya", "..........", ".............", "garbage", "çöp", "hammer", "çekiç", "flag", "bayrak", "fog", "sis", "future", "gelecek", "...............", "...............", "guide", "rehber", "harmful", "zararlı", "insect", "böcek", "invite", "davet etmek", "jam", "reçel", "jar", "kavanoz", "joke", "şaka", "kick", "tekme", "knee", "diz", "lake", "göl", "lamb", "kuzu", "leather", "deri", "leg", "bacak", "lift", "asansör", "lip", "dudak", "meat", "et", "mend", "tamir etmek", "nail clippers", "tırnak makası", "naughty", "yaramaz", "nervous", "endişeli", "noise", "ses", "novel", "roman", "overweight", "kilolu", ".", ".", ".", ".", ".", ".", "poem", "şiir", "pretty", "sevimli", "price", "fiyat", "produce", "üretmek", "reach", "ulaşmak", "refuse", "reddetmek", "reply", "cevaplamak", "rock", "kaya", "rope", "ip", "rude", "kaba", "rule", "kural", "salary", "maaş", "select", "seçmek", "sharp", "keskin", "simple", "basit", "..........", "...............", "shoulder", "omuz", "shout", "bağırmak", "sign", "imza atmak", "silent", "sessiz", "ski", "kayak", "soap", "sabun", "storm", "fırtına", "taste", "tatmak", "tent", "çadır", "throw", "atmak", "..............", "............", "tongue", "dil", "trouble", "dert", "vacation", "tatil", "valuable", "değerli", "warm", "ılık", "gift", "hediye", "glasses", "gözlük",
                //400
                "glove", "eldiven", "glue", "yapıştırıcı", "goal", "hedef", "gold", "altın", "government", "hükümet","april", "nisan", "grass", "çim", "guitar", "gitar", "hair", "saç", "track down", "iz sürmek", "anticipate", "tahmin etmek", "anxiously", "endişeli", "camel", "deve", "carefree", "kaygısız", "carrier", "kurye", "caterpillar", "tırtıl", "caution", "uyarı", "aspect", "hal-çehre-durum", "rare", "nadir", "on my own", "kendi başıma", "suitable", "uygun", "rise", "yükselmek", "pupil", "öğrenci-çırak", "announcement", "duyuru", "homeless", "evsiz", "............", "................", "income", "gelir", "addict", "bağımlı", "patient", "sabırlı", "careful", "dikkatli", "both", "ikisi birden", "employer", "işveren", "opinion", "görüş-fikir", "appropriate", "uygun", "dishes", "bulaşık", "grow", "büyümek", "around", "etrafında", "exciting", "heyecan verici", "famous", "ünlü", "after all", "nihayet", "delicious", "lezzetli", "have a nap", "şekerleme yapmak", "look like", "benzemek", "relation", "ilişki-bağ", "bathroom", "banyo", "guest", "misafir", "hall", "salon", "kitchen", "mutfak", "roof", "çatı", "attic", "çatı katı", "basement", "bodrum katı", "armchair", "koltuk", "couch", "kanepe", "chair", "sandalye", "carpet", "halı", "curtain", "perde", "quilt", "yorgan", "blanket", "battaniye", "cushion", "yastık","pillow","yastık", "çarşaf", "sheet", "fridge", "buzdolabı", "onion", "soğan", "parsley", "maydanoz", "pumpkin", "kabak", "seed", "çekirdek", "radish", "turp", "sweet", "tatlı", "vegetable", "sebze", "zucchini", "kabak", "almond", "badem", "apricot", "kayısı", "peel", "kabuk", "berry", "dut", "cherry", "kiraz", "fig", "incir", "fruit", "meyve", "grape", "üzüm", "pear", "armut", "plum", "erik", "afternoon", "öğleden sonra", "lunch", "öğle yemeği", "one hundred", "100", "one thousand", "1000", "is anybody home", "evde kimse var mı", "then yours", "seninkinden", "there", "orada", "pronounced", "telaffuz", "expressing", "ifade etmek", "keen", "meraklı", "fond", "düşkün", "can't stand", "katlanamamak", "the red one", "kırmızı olan", "latest", "en son", "wide", "geniş", "brood", "geniş", "loud", "gürültülü", "heavy", "ağır", "shallow", "sığ", "generous", "cömert",
                //500
                "shut", "kapalı", "loose", "bol", "march", "mart", "alive", "canlı", "pleasant", "hoş", "excellent", "mükemmel","terrible", "berbat", "fair", "adalet", "hold", "tutmak", "getirmek", "brign", "happen", "olmak", "provide", "sağlamak", "sit", "oturmak", "stand", "durmak", "pay", "ödemek", "lead", "yön vermek", "allow", "izin vermek", "spend", "harcamak", ".............", "............", "waiter", "garson", "journalist", "gazeteci", "judge", "hakim", "butcher", "kasap", "architect", "mimar", "reporter", "muhabir", "plumber", "su tesisatçısı", "author", "yazar", "divorced", "boşanmak", "marry", "evli", "warning", "uyarı", "accomodation", "konaklama", "admire", "hayran olmak", "adopt", "evlat edinmek", "adult", "yetişkin", "advertisement", "reklam", "..............", "............", "affection", "şevkat", "afford", "maddi gücü yetmek", "trait", "karakter", "mustache", "bıyık", "decent", "terbiyeli", ".............", ".............", "neat", "düzenli", "sculpture", "heykel", "pray", "dua etmek", "holy", "kutsal", "guess", "tahmin etmek", "sightseeing", "gezi", "souvenirs", "hediyelik eşya", "skill", "beceri", "deaf", "sağır", "............", ".............", ".............", "..............", "stained", "lekeli", "trail", "iz", "accros", "karşısında", "greeting", "selamlama", "pleased", "memnun", "october", "ekim", "near", "yakın", "trip", "seyahat", "says", "diyor", "launches", "fırlatma", "satellite", "uydu", "orbit", "yörünge", "still", "hala", "expendable", "gözden çıkarılabilir", "congrats", "tebrikler", "amount", "miktar", "deployment", "dağılım", "spirit", "ruh", "pressure", "baskı altında", "target", "hedef", "annual", "yıllık", "apologize", "özür dilemek", "appear", "ortaya çıkmak", "application", "başvuru", "apply", "başvurmak", "............", "...........", "army", "ordu", ".............", "..............", "ashamed", "utanmış", "attend", "katılmak", "attention", "dikkat", "..........", "............", "................", "..............", "belief", "inanç", "..............", "...............", "bet", "bahis", "............", ".............", "bone", "kemik", "brand", "marka", "brief", "kısa", "bright", "parlak", "bulb", "ampul", "burglar", "soyguncu", "calm", "sakin", "certain", "kesin", "citizen", "vatandaş", "coast", "kıyı",
                //600
                "comb", "tarak", "common", "yaygın", "compare", "kıyaslamak", "complain", "şikayet etmek", "consist", "oluşmak","contain", "içermek", "convince", "ikna etmek", "november", "kasım", "count", "saymak", "crime", "suç", "criticize", "eleştiri yapmak", "..........", "............", "decrease", "azalmak", "defend", "savunmak", "destination", "varış", "destroy", "yok etmek", "discount", "indirim", "disease", "hastalık", "dive", "dalmak", "divide", "bölmek", "duty", "görev", "earthquake", "deprem", "engine", "motor", "environment", "çevre", "event", "etkinlik", "excuse", "mazaret", ".........", "..........", "...............", "...............", "fear", "korkmak", "field", "tarla", "fist", "yumruk", "fold", "katlamak", "force", "güç", "forgive", "affetmek", "funeral", "cenaze", "gentle", "nazik", "governor", "vali", "guilty", "suçlu", "harbour", "liman", "hide", "saklamak", "hope", "umut etmek", "host", "misafir etmek", "humour", "espri", "..............", "..............", "imagine", "hayal etmek", "import", "ithal etmek", "improve", "geliştirmek", "ink", "mürekkep", "insist", "ısrar etmek", "invent", "icat etmek", "invest", "yatırım yapmak", ".............", "............", "jewel", "mücevher", "law", "yasa", "leaf", "yaprak", "lie", "yalan söylemek", "liquid", "sıvı", "luggage", "bagaj", "measure", "ölçmek", "..............", "...............", "minister", "bakan", "mosque", "cami", "murder", "cinayet", "muscle", "kas", "neck", "boyun", "obey", "itaat etmek", "offer", "teklif etmek", "owe", "borcu olmak", "pain", "ağrı", "palace", "saray", "permission", "izin", "pig", "domuz", "pill", "hap", "poison", "zehir", "pregnant", "hamile", "private", "özel", "promise", "söz vermek", "protect", "korumak", "protest", "protesto etmek", "public", "halka açık", "publish", "yayınlamak", "punish", "cezalandırmak", "purchase", "satın almak", "purpose", "amaç", "quit", "bırakmak", "rate", "oran", "...............", "...............", "recover", "iyileşmek", "remind", "hatırlatmak", "remove", "ortadan kaldırmak", "resign", "istifa etmek", "responsible", "sorumlu", "seatbelt", "emniyet kemeri", "secret", "sır", "..............", "...............", "shoplifting", "hırsızlık", "signature", "imza", "silk", "ipek", "size", "beden", "skin", "ten",
                //700
                "sneeze", "hapşırmak", "snore", "horlamak", "solve", "çözmek", "space", "uzay", "spy", "casus", "stare", "dik dik bakmak","stationery", "kırtasiye", "steal", "çalmak", "steward", "hostes", "stomach", "mide", "strange", "garip", "stranger", "yabancı", "sudden", "ani", "suffer", "acı çekmek", "suggest", "önermek", "survive", "hayatta kalmak", "tail", "kuyruk", "temporary", "geçici", "tiny", "küçücük", "tool", "alet", "trade", "ticaret", "truck", "kamyon", "tyre", "lastik", "vote", "oy kullanmak", "wish", "dilek", "accuse", "suçlamak", "achievement", "başarı", "adjust", "ayarlamak", "admit", "kabul etmek", "affair", "ilişki", "agriculture", "tarım", "aisle", "geçit", "article", "makale", "casting", "kalıba dökme", "grain", "tahıl", "dear", "sevgili", "colleague", "iş arkadaşı", "deserve", "hak etmek", "treasure", "değer vermek", "voyage", "yolculuk", "memorize", "ezberlemek", "hired", "işe alınmış", "traitor", "hain", "evidence", "kanıt", "leaked", "sızdırılmış", "crap", "saçmalık", "worst", "en kötü", "allowance", "nafaka", "ambassador", "büyük elçi", "apparent", "açık", "appreciate", "takdir etmek", "approve", "onaylamak", "arrest", "tutuklamak", "audience", "seyirci", "avoid", "uzak durmak", "bankrupt", "iflas etmek", "bargain", "pazarlık etmek", "beg", "yalvarmak", "beggar", "dilenci", "blame", "suçlamak", "breath", "nefes", "budget", "bütçe", "candidate", "aday", "cemetery", "mezarlık", "charming", "çekici", "client", "müşteri", "coal", "kömür", "commerce", "ticaret", "deceive", "aldatmak", "competition", "rekabet", "concentrate", "konsantre olmak", "condition", "durum", "confess", "itirafta bulunmak", "...........", "...........", "construction", "inşaat", "consult", "danışmak", "contest", "yarışma", "contribute", "katkıda bulunmak", "convert", "dönüştürmek", "court", "mahkeme", "crossword", "bulmaca", "cruel", "zalim", "deadline", "son tarih", "declare", "ilan etmek", "define", "tanımlamak", "desire", "arzu etmek", "diagnose", "teşhis", "disappear", "ortadan kaybolmak", "disappoint", "hayal kırıklığına uğramak", "..............", ".............", "distribution", "dağıtım", "dreadful", "korkunç", "eager", "hevesli", "encourage", "teşvik etmek", "enterprise", "işletme", "envy", "imrenmek", "essay", "makale", "estimate", "tahmin etmek", "evaluate", "değerlendirmek", "exaggerate", "abartmak",
                //800
                "examine", "gözden geçirmek", "exhibition", "sergi", "experiment", "deney", "fence", "çit", "fix", "düzeltmek", "fluent", "akıcı", "foolish", "aptal","forecast", "tahmin etmek", "fragile", "kırılgan", "frame", "çerçeve", "frequent", "sık", "gamble", "kumar oynamak", "gear", "vites", "grateful", "minnettar", "harvest", "hasat etmek", "hesitate", "tereddüt etmek", "hire", "kiralamak", "in advance", "önceden", "increase", "artmak", "independent", "bağımsız", "inflation", "enflasyon", "innocent", "masum", "inspection", "muayene", "inspector", "müfettiş", "insurance", "sigorta", "invoice", "fatura", "kidnapping", "adam kaçırma", "knowledge", "bilgi", "landlord", "ev sahibi", "vest", "yelek", "verification", "doğrulama", "............", "..............", "wireless", "kablosuz", "reasoning", "akıl yürütme", "definition", "tanım", "dwarf", "cüce", "trash", "çöp", "shaving", "traş olmak", "curiosity", "merak", "expand", "genişletmek", "compatible", "uygun", "surely", "kesinlikle", "ignore", "aldırmamak", "bend", "bükmek", "aware", "farkında olmak", "useful", "kullanışlı", "civilization", "medeniyet", "actually", "aslında", "peace", "barış", "just", "sadece", "sincerely", "içtenlikle", "strive", "çabalamak", "pity", "merhamet", "any time", "istediğin zaman", "loan", "borç", "magnificent", "mükemmel", "maintain", "sürdürmek", "marvelous", "harika", "massive", "muazzam", "mention", "bahsetmek", "nation", "ulus", "objective", "amaç", "observe", "gözlemek", "obvious", "apaçık", "opportunity", "fırsat", "participate", "katılmak", "percentage", "yüzde", "persuade", "ikna etmek", "postpone", "ertelemek", "process", "süreç", "profit", "kar", "prohibit", "yasaklamak", "property", "mülk", "proposal", "teklif", "prove", "kanıtlamak", "publicity", "reklam", "quantity", "reklam", "quarrel", "bozuşmak", "queue", "kuyruk", "receipt", "fatura", "receive", "kabul etmek", "..............", "..............", "recommend", "tavsiye etmek", "reduce", "azaltmak", "reject", "reddetmek", "release", "serbest bırakmak", "religion", "din", "reluctant", "gönülsüz", "rely", "güvenmek", "represent", "temsil etmek", "resolution", "karar", "resource", "kaynak", "respond", "yanıt vermek", "revenue", "gelir", "revise", "gözden geçirmek", "rub", "ovalamak", "sand", "kum", "...............", "..............", "seek", "aramak", "sense", "his",
                //900
                "july", "temmuz", "share", "pay", "skyscraper", "gökdelen", "february", "şubat", "substitute", "yedek", "suppose", "farz etmek", "swear", "yemin etmek", "tax", "vergi", "throat", "boğaz", "urgent", "acil","to book", "rezervasyon yapmak", "torture", "işkence yapmak", ".........", "...........", "treatment", "tedavi", "violent", "şiddetli", "volunteer", "gönüllü", "wealthy", "varlıklı", "weapon", "silah", "whistle", "ıslık çalmak", "wholesale", "toptan satış", "witness", "görgü tanığı", "zip", "fermuar", "...........", "..............", "them", "onlara", "then", "sonra", "those", "şunlar", "...........", "............", "able", "yetenekli", "abortion", "kürtaj", "............", ".............", "accompany", "eşlik etmek", "account", "hesap", "advice", "öğüt vermek", "advocate", "savunucu", "despite", "aksine", "devastation", "yıkım", "diver", "dalgıç", "case", "vaka", "foreman", "ustabaşı", "ambition", "hırs", "glitch", "kusur", "congested", "sıkışık", "..............", "............", "heatwave", "sıcak hava dalgası", "distance", "mesafe", "vehicle", "araç", "less", "az", "flagrant", "bariz", "behind", "arka", "destruction", "yıkım", "title", "başlık", "reduction", "kesinti", "overhaul", "bakım", "incentive", "teşvik", "shift", "vardiya", "consumption", "tüketim", "velocity", "hız", "hubris", "kibir", "mind", "akıl", "probably", "muhtemelen", "jail", "hapishane", "east", "doğu", "weed", "esrar", "sponge", "sünger", "genius", "dahi", "honor", "onur", "weird", "garip", "forbidden", "yasak", "coup", "darbe", "wildfire", "orman yangını", "blaze", "alev", "flame", "alev", "sunday", "pazar", "said", "söz konusu", "oblige", "mecbur etmek", "broad", "kalın", "daylight", "gündüz", "port", "liman", "explosion", "patlama", "brook", "dere", "bridge", "köprü", "chicken", "tavuk", "nut", "fındık", "mushroom", "mantar", "abandon", "terk etmek", "unable", "aciz", "above", "üzerinde", "absence", "yokluk", "absent", "mevcut değil", "absolute", "kesin", "absorb", "emmek", "accidentally", "kazara", "so", "bu yüzden", "or", "veya", "few", "az", "holiday", "tatil", "tonight", "bu gece", "soon", "yakında", "in a hour", "1 saat içinde", "nap", "uyku",
                //1000
                "everyone", "herkes", "talent", "yetenek", "plain", "ova", "later", "sonra", "what kind of", "ne tür", "no way", "yok artık", "more or less", "aşağı yukarı", "it sounds good", "kulağa hoş geliyor", "guess what", "bil bakalım ne oldu", "indulgent", "anlayışlı", "don't mention", "lafını bile etme","I don't mind", "umrumda değil", "if I where you", "senin yerinde olsaydım", "It's better than nothing", "hiç yoktan iyidir", "leave me alone", "beni yalnız bırak", "December", "aralık", "climate", "iklim", "largest", "en büyük", "smelly", "kokmuş", "crucial", "hayati", "..........", "...........", "watch out", "dikkatli ol", "why not", "neden olmasın", "forget about it", "unut gitsin", "hurry up", "çabuk ol", "take it easy", "rahat ol", "calm down", "sakin ol", "cheer up", "neşelen", "hold on", "bekle", "not yet", "henüz değil", "suit", "takım elbise", "knight", "şövalye", "forward", "ileri", "side", "yan", "decision", "karar", "forever", "sonsuza dek", "special", "özel", "swamp", "bataklık", "situation", "durum", "demonize", "şeytanlaştırmak", "told", "söylemek", "hurt", "acıtmak", "together", "birlikte", "once upon a time", "bir zamanlar", "hug", "sarılmak", "in charge", "sorumlu", "delicate", "hassas", "balance", "denge", "forget", "unutmak", "yet", "henüz", "headache", "baş ağrısı", "doll", "oyuncak bebek", "awful", "berbat", "did you watch", "izledinmi", "must", "zorunlu", "spite", "inat", "injury", "incinme", "friday", "cuma", "the other day", "geçen gün", "once", "bir zamnalar", "leap","sıçramak", "upset", "üzgün", "shine", "parlamak", "flee", "kaçmak", "overcome", "üstesinden gelmek", "sweep", "süpürmek", "arise", "yükselmek", "lean", "eğilmek", "strike", "saldırmak", "perhaps", "belki", "belong", "ait olmak", "laps", "tur", "wheel", "tekerlek", "ark", "gemi", "realize", "fark etmek", "toes", "ayak parmakları", "disgusting", "iğrenç", "creature", "yaratık", "starve", "açlıktan ölmek", "deal", "anlaşma", "brick", "tuğla", "ridiculous", "aptalca", "occasionally", "bazen", "cell", "hücre", "blind", "kör", "scare", "korkmak", "kiosk", "büfe", "beer", "bira", "flood", "sel", "quitter", "dönek", "caring", "şevkatli", "anymore", "artık", "bug", "böcek", "gorgeous", "muhteşem", "pride", "gurur", "warn", "uyarmak", "disgrace", "rezalet", "servant", "hizmetkar", "authority", "yetki", "repent", "tövbe etmek",
                //1100
                "wise", "bilge", "liberty", "özgürlük", "fancy", "süslü", "incredible", "inanılmaz", "You're welcome", "rica ederim", "somewhere", "bir yerde", "ashes", "kül", "forest", "orman", "insane", "çılgın", "noisy", "gürültülü", "fired", "işten çıkarmak", "closer", "daha yakın","painful", "acı verici", "shore", "sahil", "chum", "oda arkadaşı", "till", "kadar", "crowd", "kalabalık", "dodge", "atlatmak", "bit", "biraz", "strain", "gerginlik", "curve", "eğri", "aged", "yaşlı", "aid", "yardım", "aim", "hedef", "alarming", "korkutucu", "along", "boyunca", "alongside", "yanısıra", "actual", "gerçek", "although", "rağmen", "altogether", "tamamen", "among", "arasında", "amuse", "eğlendirmek", "ancient", "eski", "angle", "açı", "adequate", "yeterli", "advertising", "ilan", "advertise", "duyurmak", "without", "olmadan", "handle", "üstesinden gelmek", "eventually", "eninde sonunda", "how is it going", "nasıl gidiyor", "give me a hand", "yardım et", "get out of here", "defol buradan", "Thursday", "perşembe", "it is beyond me", "bu beni aşar", "it is up to you", "sen bilirsin", "let's go to the point", "sadede gelelim", "alligator", "timsah", "ankle", "ayak bileği", "announce", "duyurmak", "annoy", "kızdırmak", "annoying", "can sıkıcı", "annoyed", "sinirlenmiş", "anxiety", "kaygı", "anxious", "endişeli", "anyone", "kimse", "anyway", "neyse", "wisdom", "bilgelik", "missing", "kayıp", "traditional", "geleneksel", "coronation", "taç giyme töreni", "worth a shot", "denemeye değerdi", "hook", "kanca", "mayor", "belediye başkanı", "reward", "ödül", "tissue", "doku", "sibling", "kardeş", "saturday", "cumatesi", "cost", "maliyet", "shake", "sallamak", "shoot", "film çekmek", "show", "göstermek", "illness", "hastalık", "wax", "ağda", "documentary", "belgesel", "silence", "sessizlik", "as", "gibi", "remain", "kalmak", "thus", "böylece", "appeal", "başvuru", "kid", "şaka yapmak", "justify", "savunmak", "deception", "aldatmak", "consider it done", "oldu bil", "gardener", "bahçıvan", "paradise", "cennet", "extraordinary", "olağanüstü", "each other", "birbirini", "giraffe", "zürafa", "view", "görünüm", "worth", "bedel", "ordinary", "sıradan", "so be it", "öyle olsun", "after you", "önden buyrun", "bless you", "çok yaşa", "here you are", "buyrun", "it's my turn", "benim sıram", "my treat", "benden olsun", "whenever", "her ne zaman", "appoint", "tayin etmek",
                //1200
                "appointment", "randevu", "january", "ocak", "approach", "yaklaşım", "approval", "onay", "thaw", "erimek", "species", "tür", "doorbell", "kapı zili", "excruciating", "dayanılmaz", "date", "tarih", "fool", "aptal", "I mean", "yani", "briefly", "kısaca", "abstract", "öz", "since", "dan beri", "recognize", "tanımak","damn it", "lanet olsun", "relapse", "tekrar hata yapmak", "it's over", "sona erdi", "blew", "patlamak", "charm", "cazibe", "casual", "sıradan", "bump", "çarpmak", "bump into", "rastlamak", "encounter", "rastlamak", "schedule", "program yapmak", "stalker", "takipçi", "affectionate", "sevecen", "constitution", "anayasa", "barely", "zar zor", "tuesday", "salı", "wanna", "istiyorum", "kind of", "gibi", "even", "bile", "slightly", "azıcık", "boundary", "sınır", "pursuit", "uğraş", "purple", "mor", "what are the odds", "tesadüfe bak", "dip", "sos", "sweaty", "terli", "interrupting", "bölmek", "solid", "sağlam", "own", "kendi", "during", "o esnada", "when", "-dığında", "while", "-iken", "under", "altında", "close to", "yakınında", "on", "üstünde", "next to", "yakınında", "into", "içinde", "outside", "dışında", "more", "daha", "previous", "önceki", "fat", "şişman", "silver", "gümüş", "least", "en az", "at least", "en azından", "cuddling", "sarılmak", "missed", "kaçırmak", "lame", "ezik", "recess", "ara vermek", "gotta", "zorunda", "sincere", "samimi", "jackass", "ahmak", "recipe", "tarif", "tape", "kaset", "rewind", "geri sarmak", "mess", "karışıklık", "approximate", "yaklaşık", "arrange", "düzenlemek", "arrival", "varış", "arrive", "varmak", "arrow", "ok", "artificial", "yapay", "benefit", "kâr", "track", "iz", "impact", "etki", "comma", "virgül", "previously", "önceden", "council", "meclis", "trousers", "pantolon", "lose", "kaybetmek", "disaster", "felaket", "...........", "..............", "say when", "dur de", "say uncle", "pes et", "says who", "kim demiş", "never say die", "sakın pes etme", "you don't say", "hadi canım", "aside", "bir kenara", "aside from", "den başka", "fall asleep", "uyuyakalmak", "assist", "yardım", "assume", "üstlenmek", "assure", "garanti etmek", "recently", "son zamanlarda", "lately", "son zamanlarda", "I have just", "daha yeni", "evaporate", "buharlaşmak",
                //1300
                "slippery", "kaygan", "sunny", "güneşli", "broke", "parasız", "it doesn't matter", "sorun değil", "don't piss me off", "beni kızdırma", "get well soon", "geçmiş olsun", "are you kidding me", "benimle dalga mı geçiyorsun", "as soon as possible", "mümkün olan en kısa sürede", "by the way", "bu arada", "mind your business", "kendi işine bak", "sooner or later", "er yada geç", "don't bother", "zahmet etme", "what a shame", "yazık", "shame on you", "yazıklar olsun", "who cares", "kimin umrunda", "for your sake", "senin iyiliğin için", "so far so good", "şimdilik her şey yolunda", "here we go", "başlıyoruz","long story short", "kısaca", "worst case scenario", "en kötü ihtimalle", "my bad", "benim hatam", "deal with it", "toparla kendini", "how come", "nasıl olurda", "wednesday", "çarşamba", "consistently", "sürekli", "sucker", "enayi", "someone", "biri", "sample", "örnek", "speech", "konuşma", "mankind", "insanoğlu", "convincing", "ikna edici", "struggle", "mücadele etmek", "draw", "berabere", "drawback", "dezavantaj", "klutzy", "beceriksiz", "awesome", "süper", "attaboy", "aferin", "heaven", "cennet", "jealous", "kıskanç", "outrage", "rezalet", "immediately", "derhal", "demand", "talep etmek", "mutual", "karşılıklı", "hang out", "takılmak", "forefather", "ata", "grab", "yakalamak", "at last", "nihayet", "booger", "sümük", "diaper", "bebek bezi", "jeopardize", "riske atmak", "hitchhiker", "otostopçu", "to assume", "varsaymak", "hell", "cehennem", "commitment", "bağlılık", "dumped", "terk edilmiş", "dude", "kanka", "twin", "ikiz", "terrific", "müthiş", "indefinable", "tarifsiz", "horrible", "korkunç", "tears", "göz yaşı", "bleed", "kanama", "misfortune", "talihsizlik", "embarrassed", "utanmış", "awkward", "tuhaf", "fiancé", "nişanlı", "behold", "seyretmek", "ablution", "abdest", "abhor", "iğrenmek", "broad-minded", "açık fikirli", "hanger", "askı", "outspoken", "açık sözlü", "calamity", "afet", "dirge", "ağıt", "pincushion", "iğne yastığı", "thread", "iplik", "needle", "iğne", "sewing", "dikiş", "porter", "hamal", "doorman", "kapıcı", "chambermaid", "oda hizmetçisi", "stove", "ocak", "favor", "iyilik", "I lost my temper", "sinirlerim bozuldu", "Eid", "bayram", "help yourself", "buyrun", "proud", "gurur duymak", "in my opinion", "bana göre", "speechless", "suskun", "I am speechless", "nutkum tutuldu", "it is on me", "benden olsun", "keep your nose clean", "pis işlere bulaşma", "enjoy your meal", "afiyet olsun", "as for me", "bence", "rest", "dinlenme", "keep doing", "yapmaya devam et", "keep going", "ilerlemeye devam et", "let me guess", "dur tahmin edeyim", "let it be", "varsın olsun", "never mind", "unut gitsin",
                //1400
                "bike", "bisiklet", "I can't take it anymore", "artık dayanamıyorum", "I wish", "keşke", "come off it", "vazgeç", "you reckon", "sen öyle san", "one more time", "bir kez daha", "no one", "kimse", "slave", "köle", "give up", "pes etmek", "never again", "bir daha asla", "out of the blue", "aniden", "gasping", "nefes nefese", "breathless", "nefes nefese", "master", "usta", "pirate", "korsan", "by any chance", "bir ihtimal", "disguise", "kılık değiştirmek", "goofy", "aptal", "so clearly", "belli ki", "sword", "kılıç", "willing", "gönüllü", "faith", "inanç", "september", "eylül","drunk", "sarhoş", "scary", "korkutucu", "monday", "pazartesi", "trick", "kandırmak", "desperate", "çaresiz", "sink", "lavabo", "mates", "eş", "toss", "fırlatmak", "plenty", "bolca", "canny", "kurnaz", "it's uncanny", "inanılır gibi değil", "likely", "büyük ihtimalle", "trap", "tuzak", "skeptical", "şüpheci", "mysterious", "gizemli", "stuff", "eşya", "rusty", "paslı", "handle it", "halletmek", "definitely", "kesinlikle", "shrew", "şirret", "dare", "cesaret etmek", "how dare she", "bu ne cürret", "done", "tamamlandı", "delivery", "teslimat", "flip a coin", "yazı tura atmak", "stabbed", "bıçaklanmış", "impression", "izlenim", "scissors", "makas", "how much", "ne kadar", "shelter", "barınak", "unpaid", "ücretsiz", "mortal", "ölümlü", "sprain", "burkulma", "impressive", "etkileyici", "whoever", "kim olursa", "blend", "karışım", "throw up", "kusmak", "over and over", "tekrar tekrar", "villain", "kötü adam", "hint", "ipucu", "vulnerable", "savunmasız", "mad", "deli", "take a week off", "bir hafta ara ver", "exposed", "maruz", "get up", "kalk", "evac", "tahliye", "bid", "teklif", "currently", "şu anda", "initializing", "başlatılıyor", "below", "aşağıda", "vulnerability", "korunmasız", "exploit", "sömürmek", "request", "istek", "router", "modem", "inject", "aşılama", "permanently", "kalıcı olarak", "scammer", "dolandırıcı", "buddy", "ahbab", "bright side", "iyi taraf", "doubt", "şüphe", "fault", "arıza", "for a while", "bir süre için", "pull", "çekmek", "plug", "fiş", "restrain", "tutuklama", "imprison", "hapsetmek", "classified", "gizli bilgi", "quick", "hızlı", "brutish", "vahşi", "pay attention", "kulak vermek", "attitude", "tavır", "loop", "döngü", "debug", "hata ayıklama", "plugin", "eklenti", "refresh", "yenilemek", "mute", "sessize almak", "unmute", "sesi açmak",
                //1500
                "constuctor", "yapıcı", "overloading", "aşırı yükleme", "junk", "önemsiz", "remote", "uzak", "database", "veri tabanı", "customize", "özelleştirme", "may", "mayıs", "brace", "parantez", "enclosed", "kapalı", "invalid", "geçersiz", "token", "işaret", "threat", "tehdit", "june", "haziran", "undef", "tanımsız", "attract", "cazibe", "attractive", "çekici", "autumn", "son bahar", "away", "uzak", "August", "ağustos", "go bad", "çürümek", "bad tempered", "huysuz", "bake", "pişirmek", "because of", "yüzünden", "behave", "davranmak", "beneath", "altında", "beyond", "ötesinde"

        };
        for(int l=0;l<dizi.length;l++) {
            String a=dizi[l];
            if (a.equals("sunday")) {
                System.out.println("---"+l/2);
                break;
            }
        }//V2
        System.out.println("versiyon 2 kodalrım");

    }
}
