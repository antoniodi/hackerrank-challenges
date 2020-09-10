package challenges.easy

object Gemstones {

  def main(args: Array[String]): Unit = {
    //val gemstones = countGemstones( List("abcdde", "baccd", "eeabg") )
    //val gemstones = countGemstones( List("basdfj", "asdlkjfdjsa", "bnafvfnsd", "oafhdlasd") )
    val gemstones = countGemstones( Mine )
    //val zip = "abcdde" zip "baccd"
    gemstones
  }

  def countGemstones( minerals: List[String] ): Int = {
    minerals.reduce[String]((s1, s2) => {
      s1.foldLeft( "" ) { ( gemstone, letter ) =>
        if( s2.contains( letter ) ) s"$gemstone$letter" else gemstone
      }.distinct
      } ).length
  }

  val Mine = List(
    "bbdqrsghsilxjdmqwkybbfiwywaorzfehdrabckdhdocmxrkljjc",
    "vcwgfqibjjlimkesabmhjcwqdlkhgbuds",
    "fqaweackxnbfkdfozshmrihhipamuqyotzqinbwsackeplxokjscyqpbevfgcjfiwuhcfdbnjcdvfckxxxvtqlczgcgqohprhdk",
    "lwhwuhiumqmjgkjxepngoyeatlbkldrgvdfutcyomlbonukisadihjhyiuadmymleacxfiuyjbuaezvqu",
    "hseoeseegjghpukjouusmbcutcehxpzbdtjyhceyeikiyjfixxpiypypqzvbsimycgvfxguaxiqjzlnswiadiddgxyvebhfbfsm",
    "iobaeqvzdhvfcbwlkysbvqwaddzuvpwpjyugfbfdi",
    "helfnjlcafdctkiabg",
    "rvmebarukeehwlheohklpcmjgohcagqjhaqgdefxhfnicorlxmssbwnmyck",
    "nqfdncbkrpaggvetfgtlclyiiwyschefxsknarjftrfpumixeztfxbmcgogqbplunicifdruruimbcnckwppeu",
    "kxjcbhflqgipdaex",
    "xqjcgjtgtkjoalaweeqkwvzxjvfulkpcgvzsdgbciqpmgexyqmcnhvwicawdscbxeaetfllhznfhbpdvfkbhqqeojpjl",
    "fkcufiqxvrhjzdmdlljjehjcracvyfxjnruxgplbpfajkriahredzphncibchceukd",
    "jkcyeyzblgsojrvgnnikchadpwrxngmsajofsdusnidczj",
    "ziahllampcekzacdwwejnjvahpbgvftlhcsbfvmdfjchknginmpzdkutwlinzbrpgljn",
    "aofoqhmegpeblldkkaghsmcwkoblsshhzinyqfsczknqroefdojugisqmnnghsloacfe",
    "dkbcilzjfheag",
    "hzawbsrolndwomogotlkyagjgtndbckzafbwihhofbegcavvabrfejfnekferpiohddsip",
    "epfdjnsxmtodkikkbljxhgcqgrsfqtijqoiqiyaswffs",
    "qskvyhqxonnxgawtamccvapoquajgsoilesalqzqumentidyxqlwbfiinbhbuagkawrfnyagqmnxcakcc",
    "zzpitzmnlazccsrtdjaikekuejqdlnxedpvjxgbpbeatwgwnfqirgscpalocyauptqabkwxmslghftewmiguerwrmu",
    "uvnqlajukxeqdocksldxbaiifrbtrzbfetsgqpjpsmpbfwutfilqkosmphoodvbclcejiqn",
    "dyfjxblnldqekqhhncmofxeefurefriadhuqiovugdajcjvugkswjnwraou",
    "gahdaxbkryjhdndzyjycxddrejgfli",
    "kcihlqborkmleificaednrieydrjxg",
    "xtdeouofbuethqrkjslurdqosaiamnnggpiqslecueif",
    "ioayakokkwjqffdksiegruqijxljiduirrsytejajcyyvvahgokbyilisovdtfydibezjkyiunohkarkskgmghctutsuz",
    "wbpygdozjheqwdhelafefqxmvgokgmnkjexqxysliitnxcurmamnkwpdn",
    "qruvfcffbkrdlaprasgkdaljkhpdltwlgysdaiakyxedxtjnmt",
    "sbvhmqqbiwzedjaxbchcqtkqgikieqvjijxomktpalhekfklawseidicilw",
    "aceivdnoayhypfblgojk",
    "jgwenhdvpjkliiiktiyjgylocqruztylacengblwavqghcjmpnxtuhfikwwzzudzgfhzobb",
    "vtxlwgwgzqrbxkodbvldumchhcziofvibjrucgflyecdczevrnrvpgrxewebqdrzfttdfydevhikzkaoqdhhavdzqxegus",
    "ioqlaenfoluwrmxdsgabnuguqeaionmfjkmhmpierodrpctemcwieyujifctyxihgsrhkfxwpcsfhakifwgbdvepbofpkceytzc",
    "llccafdjoeimwqivkkaikwmagqbnjjohbob",
    "jcpfzycphvgazjieambnepyxdlduakylmheukiaelvbsgolfya",
    "abikelftgchngzndjltfkia",
    "hvzktkkkvcszbzlcyoflobczyqibzlaxnmewoyimtvgdpfxpwibecbbosymllzekutzvtrzdlwvarcklukuhqwdjbexg",
    "hejddgbcybarayjjeplisdjogfk",
    "zjqqoiejtjghefmakdkyobyxgtqttwajhbwwovkicfjaknyfnwdcesdlohraijbmjxtrqjcjcpmyzdfjicmkajnrepcicz",
    "ariqtumztrzbkxbxtlzggnjlhssfckdjmqjhznkiusbtyfqsvoqzmeeglaqhcc",
    "uphhjfpachppjcenqhfrsecgzgkodsxrcdaikimbooqsdyzbtmtxiahhhndhffrqlf",
    "jkvgwcddbpfkiqaljzduulhszheuak",
    "iinltymxdjaniletgirjcnfdcshagmiujtlvkcofrhdcmcoagaelzzxzbxgcwfsghkxlhzhq",
    "njmjxhagblkohpncfexeeiqispfxmfgfdycgfcduzceoynkvvwidjqtbtritdhliznvhexrtknhasfvbz",
    "vqhfhuvehdnalqsjirrlntjptxgazyoygmgvzkerkscbclahzjejdj",
    "ajdqsaegkdzqkjichbberpxuiiftzhdwnwjpdafmmgswiktacfczidizviqizuxbloxjehwzkzxvadlrrolgtdk",
    "btmwajtcddggbeixuyikasltfbgxxwtkpgysekztqkhbeufsyrkrfytqcgfnkjdjrhsigmcfnjks",
    "kvnaaadzcgcradbbijizevsvdbgjczefgtknpoeikhgzacizcrhpxcdwfaolywvyttvwxat",
    "zladbcifxidynqkwpaawkfjjlijhnjsjgxxqirewtohhbdhu",
    "ysrixbbvzjrdchotafkvoaleloengoi",
    "ycpusjmqjuxbnyfhbgnlromydpgabchedkaukbudasddabbgenpefouahiefpaonoeerkbhsdceccfbgbbluw",
    "zjlafdpcyfhrpxkgmervybwiirmesqbb",
    "lmfgtcxibbuumtbndpcceeklvnjhxgreiyktlxjflcmikpvzgrjqwrjxdrpxlulag",
    "votjidbopacihgglkepifm",
    "katbrwvxelpefnhfgijytblcdtiltoialsmwmdlkvzxtv",
    "ekbghbuzbpddhpaznkckxtjniilsvqoyafvsokytlaamjxeulekhpxwoxwpdhntvelijimrupz",
    "qteeraqvjfrfvledluixqgaqcjgecdhgnhigdmanxjvbfbkgjkiapcpd",
    "mbixclkjbdwmcalhzbiukjfkwhegbeylojfk",
    "jzvlokiaifyurcrkcugylxrbfdhivfhecjjftgeti",
    "pgzsgaxpoabnivmodchfymusfnevluwkelsdqbgihbtlhtmmcjxadvcebu",
    "jbkufectdbsemdlchexdkiketvdcxggisgtffepuaafiogbota",
    "xinwhetqhzdwzipccnkcuatzhskfgiemznpgsikepxartgkcwlwgybotqhvmycccjpejxizejyvzyvpsoxgmsqpewiolbxh",
    "txavswedcpihjagcydagmepidkbjjgvilgxnlfqgcn",
    "xeehjbakyumpzcrvduishciloebteaobkykjcplkkqkqsyrgbhlmuqhhfdsmnpzbpldjvevfhfmrvrzpynairhcegioevkfu",
    "pfhrlzkkkjcskecqlgcktziiarcclwdxbsays",
    "tkgiabitrvhhjqinntprkideangchnjqvigauicyxiflrcvfrcfxljkdcehnquolkaat",
    "jekwpkchykffwrkdlgozalwbswzsigqtfgtoqgioepfmhafkh",
    "kjcxgkofihbsosdelxtbuhady",
    "cjlehfkdigtkabh",
    "ffamufgokwkqehydbgulbpavowwaoccsyodftcrovbccdijcuzffomovzuolodltyphpec",
    "yejceqpcridocsstczotycksnarccvdlcgbncmqbhsbfjammugivhoeudgxuroy",
    "znjfeaeoljdeebllhgjwjaduheilpcncydshqwqsqhjahfyjlwbnywhqkfib",
    "bcgjdlikcfahe",
    "dsxitobduawkfghfdisktoidfwcsjrodrmlwlvanuvkgyykacaonyginemlyclrkhnccyevnife",
    "axbcvgwhakkhdypjhekhigwjcoflxjcfnijelhxupnbmbpvrcujthxqnegbinigbs",
    "jklgotdodtuxgyklybevzejaaecxqdqhzjfzdighojgtohiuovjulqdwusccana",
    "cdeggafivrekajlgqibqhghp",
    "lvurpzvgkogmejakyjlbyezjegokhdocvfjakyycxgwwskvmkzlwqfvpeumasdaqhipuurckyhovogcxfgfviil",
    "cejtaayhdplbiyorejjjpsgwftehpoddmpalnttbgqsgkbqaljdkrksdgalykkhcrfpifjqnlddirh",
    "tzafapuhconhcpqejheqebhbswugelhvejikbxgkycjpfmhlrremckyikgngssvhbihyxdomjsbsmsfoxssaxagaqpfggdl",
    "uvibpddjghewhtpfpkhujasqpqcamftbzariicbfulzrxs",
    "hrmlhlvpvokknghvsndqmtbyiuryycnssxgefywkgbaheobzgitxlocbgsbtnlowojykovgadmpcavlavzcjvgofffnuvjjqh",
    "rkiryiybhtbeapddoucmkzviugaezlhfpokjh",
    "nbikwapltoanmmublahjzypxychikjkpvaghwyfxgoifptjolfjdrjqyajkhodebxjjvzjbakhnvbnobgtuegigpf",
    "smcjmcqwtaqlzqlcricdxiazpqoshapebkwuygkpjstxogurfpbxrsbqyhpvnngjxadftygleyzj",
    "lcatneipjyukgqxbowhifgbpkdxjzgtxldmlabyh",
    "cpgmhlbefkajdi",
    "icrhblvueomaupcqajhmopihgxauvfmlwnawcdhfieccqgfcfgldkl",
    "dymghobydwewlszavbjhhbdeieztifzgpupzjlugigxklcrjkvfaegfooboezq",
    "vdhdemfvjklgkufcwiajyykdqdrihwwamyfccjbihcgjwmageknzeelcwahkustaliymsqxfhwyngsyqbglwdgsxqyek",
    "trzxjbmrgwoylikzihscfcerpeetavpvoggsdnhjewrjcb",
    "udyizjejkfdtamuebkopydjscbuaifedolwlvdtmvazzxlewnmhbyiegvngom",
    "yuoeccdwpxeeanwuvmpfplkwgjeqjbsxifyyhamjxkdeijhncvj",
    "bjaolfckkmohhdebqyaicg",
    "hchcigpkfkwadlxprbcljkxisdtgzdgazqe",
    "csjfeeggmnpblifkjgdbwuhbamduyaqwzllftosogbzozkgy",
    "zumwocksuudgozgbyhfbhoiaurfrcexwelodkpjegistsubipiqyv",
    "xmjczzulufslcqelnrzjcmsckassyitievzfdybqhiggfvtufahbgmvwfnnjoibeuibxtuyvenhmypaeyujwvrndlwrbnldr",
    "bejfdrjwuhibxlyctjfqetraygrhqcopkmgfbyqk",
    "fgjkdkleyqtfksoqaflmplorbojafbhphcggdhbrilgkg"
  )
}
