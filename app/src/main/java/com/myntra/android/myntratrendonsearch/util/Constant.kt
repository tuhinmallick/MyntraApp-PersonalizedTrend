package com.myntra.android.myntratrendonsearch.util

import com.myntra.android.myntratrendonsearch.ui.model.Influencer
import com.myntra.android.myntratrendonsearch.ui.model.InstaPost
import com.myntra.android.myntratrendonsearch.ui.model.TrendingProduct

object Constants {
    const val PHONE_NUMBER = "phoneNumber"
    val catList: List<String> = arrayListOf(
        "WOMEN",
        "MEN",
        "KIDS",
        "BEAUTY & PERSONAL CARE",
        "HOME & LIVING",
        "GADGETS"
    )
    val cat2List: List<List<String>> = arrayListOf(
        arrayListOf(
            "Saree",
            "Kurta Set",
            "Ethnic Dresses",
            "Kurtis Tunic & Tops",
            "Palazzo & Trousers",
            "Dresses & Jumpsuits",
            "Tops, T-shirts & Shirts",
            "Trousers",
            "Skirts",
            "Sweaters",
            "Jacket"
        ),
        arrayListOf(
            "T-Shirts",
            "Coats",
            "Sneakers",
            "Sports Shoes",
            "Jeans",
            "Shorts",
            "Formal Trousers",
            "Sherwani"
        ),
        arrayListOf(
            "Explore Kids Store",
            "Festive Kids Store",
            "Girls Clothing",
            "Boys Clothing",
            "Girls Footwear",
            "Boys Footwear"
        ),
        arrayListOf(
            "Women",
            "Men",
            "Explore Beauty Store",
            "Explore Premium Beauty Store"
        ),
        arrayListOf(
            "Decor", "Kitchen and Dining",
            "Bed",
            "Furnishing",
            "Storage & Organizers",
            "Bath"
        ),
        arrayListOf(
            "Smart Watches", "Fitness Band",
            "Headphones", "Speakers"
        )
    )

    var trendingWear: List<TrendingProduct> = arrayListOf(
        TrendingProduct(
            "Black Notch Collar Tuxedo Wrap Dress", 0, "", arrayListOf(
                Influencer(
                    "Alia Bhatt",
                    "https://img.faballey.com//images/banner/e7335e1a-4d1f-4f5a-b80b-3605cad8a6dc.jpg"
                ),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Karina", ""),
                Influencer("Kokila", "")
            )
        ),
        TrendingProduct(
            "Red Floral Belted Ruffle Wrap Dress", 0, "", arrayListOf(
                Influencer(
                    "Shraddha Kapoor",
                    "https://img.faballey.com//images/banner/3976b000-73df-4ac4-a557-d636dcf623a7.jpg"
                ),
                Influencer("Selena", ""),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Karina", "")
            )
        ),
        TrendingProduct(
            "Black Polka Ruffled Wrap Skater Dress", 0, "", arrayListOf(
                Influencer(
                    "Sharmin Sehgal",
                    "https://img.faballey.com//images/banner/509e2df8-ec40-4446-a22a-e365a011b270.jpg"
                ),
                Influencer("Selena", ""),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Kokila", "")
            )
        ),
        TrendingProduct(
            "Yellow Floral Asymmetric Hem Belted Dress", 0, "", arrayListOf(
                Influencer(
                    "Katrina Kaif",
                    "https://img.faballey.com//images/banner/20ed6ac6-b155-4843-81ed-93740911c801.jpg"
                ),
                Influencer("Selena", ""),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Kokila", "")
            )
        ),
        TrendingProduct(
            "Black Ruffled Front Playsuit", 0, "", arrayListOf(
                Influencer(
                    "Taylor Swift",
                    "https://img.faballey.com//images/banner/010240b6-212e-487d-9df4-a618b9767adc.jpg"
                ),
                Influencer("Tailer", ""),
                Influencer("Katrina", ""),
                Influencer("Karina", ""),
                Influencer("Kokila", "")
            )
        )
    )

    var trendingWearMenBottom: List<TrendingProduct> = arrayListOf(
        TrendingProduct(
            "Levi's Slim Fit Jeans", 0,
            "https://firebasestorage.googleapis.com/v0/b/todaystarget.appspot.com/o/levi'sjeans.png?alt=media&token=3509528b-0e94-4414-9ea2-6e8bd0d5841a",
            arrayListOf(
                Influencer(
                    "Chris Pine",
                    "https://i.pinimg.com/564x/f8/6b/23/f86b23d452bdd488347dc8f8823473b2.jpg"
                ),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Karina", ""),
                Influencer("Kokila", "")
            )
        ),
        TrendingProduct(
            "FLY HAWK Mens Slim Fit Tapered Flat Front Casual Pants", 0,
            "https://firebasestorage.googleapis.com/v0/b/todaystarget.appspot.com/o/casual_pants.png?alt=media&token=cfffb80f-0de4-4783-8213-1665d6daadf3",
            arrayListOf(
                Influencer(
                    "Zac Effron",
                    "https://i.pinimg.com/564x/d0/ac/9b/d0ac9bad487c1468b866be8ca9ee7385.jpg"
                ),
                Influencer("Selena", ""),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Karina", "")
            )
        ),
        TrendingProduct(
            "Signature by Levi Strauss & Co. Gold Label Men's Slim Straight Fit Jeans", 0,
            "https://firebasestorage.googleapis.com/v0/b/todaystarget.appspot.com/o/index.webp?alt=media&token=5bde4e35-639a-4b62-9fb6-31206b84ddb9",
            arrayListOf(
                Influencer(
                    "Chance The Rapper",
                    "https://i.pinimg.com/564x/f0/cd/24/f0cd24c4597f8f0814770e32bbc0204d.jpg"
                ),
                Influencer("Selena", ""),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Kokila", "")
            )
        ),
        TrendingProduct(
            "Hat and Beyond Mens Jogger", 0,
            "https://images-na.ssl-images-amazon.com/images/I/719KpTK-OxL._AC_UY550_.jpg",
            arrayListOf(
                Influencer(
                    "Tom Holland",
                    "https://i.pinimg.com/564x/39/d9/34/39d934e2ac7db2ac01f3d0ce9f8a097b.jpg"
                ),
                Influencer("Selena", ""),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Kokila", "")
            )
        ),
        TrendingProduct(
            "Navy Blue Solid Dhoti", 0,
            "https://img0.junaroad.com/uiproducts/16567390/zoom_0-1568116172.jpg",
            arrayListOf(
                Influencer(
                    "Ranveer Singh",
                    "https://s3-ap-southeast-1.amazonaws.com/seenitcdn/487125a4e4175564a5.jpg"
                ),
                Influencer("Tailer", ""),
                Influencer("Katrina", ""),
                Influencer("Karina", ""),
                Influencer("Kokila", "")
            )
        ),
        TrendingProduct(
            "Skinny Jeans with GapFlex", 0,
            "https://www.gap.com/webcontent/0019/224/207/cn19224207.jpg",
            arrayListOf(
                Influencer(
                    "Colton Haynes",
                    "https://i.pinimg.com/564x/11/e1/68/11e168f615dfebae933f0cfe78cfa17f.jpg"
                ),
                Influencer("Tailer", ""),
                Influencer("Katrina", ""),
                Influencer("Karina", ""),
                Influencer("Kokila", "")
            )
        ),

        TrendingProduct(
            "Skinny Grey Japanese Traveler Jean", 0,
            "https://firebasestorage.googleapis.com/v0/b/todaystarget.appspot.com/o/jeans.png?alt=media&token=fe9d770b-c914-4616-82ab-398133f511f5",
            arrayListOf(
                Influencer(
                    "Adam Levine",
                    "https://i.pinimg.com/564x/de/67/48/de674825b9ad89573048ebfc89476775.jpg"
                ),
                Influencer("Tailer", ""),
                Influencer("Katrina", ""),
                Influencer("Karina", ""),
                Influencer("Kokila", "")
            )
        )
    )

    var other: List<TrendingProduct> = arrayListOf(
        TrendingProduct(
            "Men Navy Blue & Tan Brown Analogue Watch MV2845", 0,
            "https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/productimage/2020/10/6/72f7f1fb-05eb-4932-b111-00d927337d381601943278671-1.jpg",
            arrayListOf()
        ),
        TrendingProduct(
            "Navy and White Polka Dot Tie ",
            0, "https://cdn.lookastic.com/navy-and-white-polka-dot-tie-original-3277197.jpg",
            arrayListOf()
        ),
        TrendingProduct(
            "Canali woven-effect pointed tie",
            0, "https://cdn-images.farfetch-contents.com/14/78/49/03/14784903_25075734_480.jpg",
            arrayListOf()
        ),
        TrendingProduct(
            "Canali woven-effect pointed tie",
            0, "https://cdn.lookastic.com/dark-brown-sunglasses-original-9639763.jpg",
            arrayListOf()
        ),
        TrendingProduct(
            "Nike Lore Square Sunglasses",
            0,
            "https://cdn.lookastic.com/dark-brown-sunglasses/lore-square-sunglasses-medium-10261603.jpg",
            arrayListOf()
        ),
        TrendingProduct(
            "Puma Men Black & White Flexracer 20 IDP Running Shoes",
            0,
            "https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/productimage/2020/10/29/60bbe076-d79a-481f-ad90-d62aabe1683a1603914990320-1.jpg",
            arrayListOf()
        ),
        TrendingProduct(
            "Decathlon Men Navy Blue Badminton Shoes",
            0,
            "https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/productimage/2020/11/14/02d340d8-51e8-47e5-9c7f-bb06dd1d86ae1605321431369-1.jpg",
            arrayListOf()
        )
    )

    var other0: List<TrendingProduct> = arrayListOf(
        TrendingProduct(
            "Dark Brown Leather Belt ",
            0,
            "https://cdn.lookastic.com/dark-brown-leather-belt-original-2451651.jpg",
            arrayListOf()
        ),
        TrendingProduct(
            "Navy Blazer",
            0,
            "https://cdn.lookastic.com/navy-blazer-original-437274.jpg",
            arrayListOf()
        ),
        TrendingProduct(
            "Brown Leather Messenger Bag",
            0,
            "https://cdn.lookastic.com/brown-leather-messenger-bag-original-2388471.jpg",
            arrayListOf()
        ),
        TrendingProduct(
            "Dark Brown Leather Holdall",
            0,
            "https://cdn.lookastic.com/dark-brown-leather-holdall-original-8574631.jpg",
            arrayListOf()
        ),
        TrendingProduct(
            "Brown Canvas Tote Bag",
            0,
            "https://cdn.lookastic.com/brown-canvas-tote-bag-original-8625016.jpg",
            arrayListOf()
        ),
        TrendingProduct(
            "Navy Blazer",
            0,
            "https://cdn.lookastic.com/navy-blazer-original-437274.jpg",
            arrayListOf()
        ),
        TrendingProduct(
            "Black Blazer", 0, "Black Blazer", arrayListOf()
        )
    )

    var trendingWearMenTop: List<TrendingProduct> = arrayListOf(
        TrendingProduct(
            "Pima Performance Crew Shirt", 0,
            "https://firebasestorage.googleapis.com/v0/b/todaystarget.appspot.com/o/shirt1.png?alt=media&token=65468636-1b61-4de7-be78-dfc2e96e74a7",
            arrayListOf(
                Influencer(
                    "Stephen Amell",
                    "https://i.pinimg.com/564x/b6/8e/bd/b68ebd70f44609cfb38bf6c8f89d4958.jpg"
                ),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Karina", ""),
                Influencer("Kokila", "")
            )
        ),
        TrendingProduct(
            "Premium Casual Inner Contrast Dress Shirt", 0,
            "https://images-na.ssl-images-amazon.com/images/I/61Jjao6kLsL._AC_UY550_.jpg",
            arrayListOf(
                Influencer(
                    "Stephen Curry",
                    "https://i.pinimg.com/564x/00/fa/1c/00fa1c1e2155983b5e105f2500ac55a5.jpg"
                ),
                Influencer("Selena", ""),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Karina", "")
            )
        ),
        TrendingProduct(
            "Wrangler Slim Fit Denim Shirt", 0,
            "https://firebasestorage.googleapis.com/v0/b/todaystarget.appspot.com/o/shirt2.png?alt=media&token=765cc068-0fec-4dfd-bfc1-ba18df93f885",
            arrayListOf(
                Influencer(
                    "Chris Hemsworth",
                    "https://i.pinimg.com/564x/98/c0/3a/98c03a5ef2a5d94773b1b914a004134a.jpg"
                ),
                Influencer("Selena", ""),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Kokila", "")
            )
        ),
        TrendingProduct(
            "Shaker Knit Cardigan Sweater", 0,
            "https://firebasestorage.googleapis.com/v0/b/todaystarget.appspot.com/o/shirt3.png?alt=media&token=c70c5f4e-1c48-4c44-95fe-24834a1c8eee",
            arrayListOf(
                Influencer(
                    "Zac Efron",
                    "https://i.pinimg.com/564x/14/dd/13/14dd13ca60ae5e92eb33c1c46fbc8bff.jpg"
                ),
                Influencer("Selena", ""),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Kokila", "")
            )
        ),
        TrendingProduct(
            "Only & Sons Chambray Shirt", 0,
            "https://firebasestorage.googleapis.com/v0/b/todaystarget.appspot.com/o/shirt4.png?alt=media&token=90cff17b-f577-432e-9daa-93d64d8c25ca",
            arrayListOf(
                Influencer(
                    "Bret McKenzie",
                    "https://i.pinimg.com/564x/59/07/6a/59076a73fa002555710b71c7b8556b8f.jpg"
                ),
                Influencer("Tailer", ""),
                Influencer("Katrina", ""),
                Influencer("Karina", ""),
                Influencer("Kokila", "")
            )
        )
    )

    val postList1 = arrayListOf<InstaPost>(
        InstaPost(
            "https://img.faballey.com//images/banner/f912e318-8635-40dc-ad80-57d55e18070b.jpg",
            "Alexa Chung @ Time Square US Citi Concert",
            "www.faballey.com/steal-her-style",
            "www.faballey.com"
        ),
        InstaPost(
            "https://img.faballey.com//images/banner/dbcf0485-aad6-44f7-a9a7-bd9319c2dfb9.jpg",
            "Karlie Kioss @ London, UK",
            "https://www.instagram.com/tv/CHAIL1VJFMT/?igshid=frw7au8zeaeu",
            "www.instagram.com"
        ),
        InstaPost(
            "https://i.pinimg.com/736x/31/05/94/31059415e5c09e612a45f9d42a193718.jpg",
            "Selena Gomez @ Model Style & Celebrity Style & Photoshoot",
            "https://in.pinterest.com/pin/475270566928011652/",
            "in.pinterest.com"
        ),
        InstaPost(
            "https://scontent-del1-1.cdninstagram.com/v/t51.2885-15/e35/p1080x1080/121640038_200215504951684_5056873300126346118_n.jpg?_nc_ht=scontent-del1-1.cdninstagram.com&_nc_cat=1&_nc_ohc=zMkivuAI4YUAX_NN9Pv&tp=19&oh=b9c048f48008e266ef495d837b92da3c&oe=5FC7B7D8",
            "Kim Kardashian @ Home",
            "https://www.instagram.com/tv/CHAIL1VJFMT/?igshid=frw7au8zeaeu",
            "www.faballey.com"
        ),
        InstaPost(
            "https://www.masala.com/public/images/2020/02/19/DSC_0073-2880x4316.JPG",
            "Kiara Advani @ Mussoorie - The Queen Of Hills",
            "https://www.instagram.com/tv/CHAIL1VJFMT/?igshid=frw7au8zeaeu",
            "in.pinterest.com"
        ),

        InstaPost(
            "https://img.faballey.com//images/banner/f912e318-8635-40dc-ad80-57d55e18070b.jpg",
            "Alexa Chung @ Time Square US Citi Concert",
            "www.faballey.com/steal-her-style",
            "www.faballey.com"
        ),
        InstaPost(
            "https://img.faballey.com//images/banner/f912e318-8635-40dc-ad80-57d55e18070b.jpg",
            "Alexa Chung @ Time Square US Citi Concert",
            "www.faballey.com/steal-her-style",
            "www.faballey.com"
        ),
        InstaPost(
            "https://img.faballey.com//images/banner/dbcf0485-aad6-44f7-a9a7-bd9319c2dfb9.jpg",
            "Karlie Kioss @ London, UK",
            "https://www.instagram.com/tv/CHAIL1VJFMT/?igshid=frw7au8zeaeu",
            "www.instagram.com"
        ),
    )

    val postList2 = arrayListOf<InstaPost>(
        InstaPost(
            "https://i.pinimg.com/564x/c7/d8/63/c7d863978d57a699645234452a057397.jpg",
            "Brad Pitts @ Pinterest",
            "https://in.pinterest.com/pin/31103053665924466/",
            "in.pinterest.com"
        ),
        InstaPost(
            "https://kizsalsorunlar.com/k/uploads/2013/10/ian-somerhalder-wrangler-01-300x504.jpg?x15615",
            "Ian Somerhalder @ Instagram",
            "https://www.instagram.com/tv/CHAIL1VJFMT/?igshid=frw7au8zeaeu",
            "www.instagram.com"
        ),
        InstaPost(
            "https://i.pinimg.com/564x/f9/88/b8/f988b822ab41b79fb28a8011d9a40b2a.jpg",
            "Steve MvQueen @ _",
            "https://in.pinterest.com/pin/769271180082456276/",
            "in.pinterest.com"
        ),
        InstaPost(
            "https://firebasestorage.googleapis.com/v0/b/todaystarget.appspot.com/o/Chris-Pine-wears-Wrangler-Denim-Jacket-and-Common-Projects-Sneakers-1.jpg?alt=media&token=49d1f42f-5151-495d-a058-2fd29857c260",
            "Chris Pine Dinner @ Madeo restaurant",
            "https://www.instagram.com/tv/CHAIL1VJFMT/?igshid=frw7au8zeaeu",
            "instagram.com"
        ),
        InstaPost(
            "https://i.pinimg.com/474x/45/60/04/456004a58ffedad75a4745a364e006fc.jpg",
            "Steve Chung",
            "https://www.pinterest.co.uk/pin/307441112063596511/",
            "in.pinterest.com"
        )
    )
    val sizes = arrayListOf<String>("S", "M", "L", "XL", "XXL")

}
