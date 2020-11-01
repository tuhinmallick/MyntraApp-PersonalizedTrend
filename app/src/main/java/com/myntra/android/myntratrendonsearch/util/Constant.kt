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
            "Black Notch Collar Tuxedo Wrap Dress", arrayListOf(
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
            "Red Floral Belted Ruffle Wrap Dress", arrayListOf(
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
            "Black Polka Ruffled Wrap Skater Dress", arrayListOf(
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
            "Yellow Floral Asymmetric Hem Belted Dress", arrayListOf(
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
            "Black Ruffled Front Playsuit", arrayListOf(
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

    var trendingWearMen: List<TrendingProduct> = arrayListOf(
        TrendingProduct(
            "Olive Green Hooded Sweatshirt", arrayListOf(
                Influencer(
                    "Shahrukh Khan",
                    "https://s3-ap-southeast-1.amazonaws.com/seenitcdn/788185f1e1902d1be2.jpg"
                ),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Karina", ""),
                Influencer("Kokila", "")
            )
        ),
        TrendingProduct(
            "Roadster Men Blue Solid Polo Collar T-shirt", arrayListOf(
                Influencer(
                    "Aamir Khan",
                    "https://s3-ap-southeast-1.amazonaws.com/seenitcdn/608285c5a3fa251a4f.jpg"
                ),
                Influencer("Selena", ""),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Karina", "")
            )
        ),
        TrendingProduct(
            "Men Grey Melange Athleisure Track Pants", arrayListOf(
                Influencer(
                    "Ranbir Kapoor",
                    "https://s3-ap-southeast-1.amazonaws.com/seenitcdn/817605f7afcb43cf8b.jpg"
                ),
                Influencer("Selena", ""),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Kokila", "")
            )
        ),
        TrendingProduct(
            "Black Pinstripe Shirt", arrayListOf(
                Influencer(
                    "Virat Kohli",
                    "https://s3-ap-southeast-1.amazonaws.com/seenitcdn/619515c8df0734c7e0.jpg"
                ),
                Influencer("Selena", ""),
                Influencer("Tailor", ""),
                Influencer("Katrina", ""),
                Influencer("Kokila", "")
            )
        ),
        TrendingProduct(
            "Navy Blue Solid Dhoti", arrayListOf(
                Influencer(
                    "Ranveer Singh",
                    "https://s3-ap-southeast-1.amazonaws.com/seenitcdn/487125a4e4175564a5.jpg"
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
        InstaPost("", "", "", ""),
        InstaPost("", "", "", ""),
        InstaPost("", "", "", ""),
        InstaPost("", "", "", ""),
        InstaPost("", "", "", ""),
        InstaPost("", "", "", ""),
        InstaPost("", "", "", ""),
    )

    val postList2 = arrayListOf<InstaPost>(
        InstaPost(
            "https://www.clickandfab.com/wp-content/uploads/2019/01/Celebrity-brand-clothing.jpeg",
            "Salman Khan @ Being Human Clothing",
            "www.faballey.com/steal-her-style",
            "www.faballey.com"
        ),
        InstaPost(
            "https://i.pinimg.com/736x/5b/36/5e/5b365e2c6a80abdf2ca96b8f74bf24da.jpg",
            "Siddharth Malhotra @ Home",
            "https://www.instagram.com/tv/CHAIL1VJFMT/?igshid=frw7au8zeaeu",
            "www.instagram.com"
        ),
        InstaPost(
            "data:image/jpeg;base64,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",
            "Shahrukh Khan @ Film City, Mumbai ",
            "https://in.pinterest.com/pin/475270566928011652/",
            "in.pinterest.com"
        ),
        InstaPost(
            "https://i.pinimg.com/736x/3e/f5/67/3ef567e7317b562942c9ffee38dddf8f.jpg",
            "Sushant Singh Rajput @ Indira Gandhi Airport, Delhi",
            "https://www.instagram.com/tv/CHAIL1VJFMT/?igshid=frw7au8zeaeu",
            "www.faballey.com"
        ),
        InstaPost(
            "https://i.pinimg.com/736x/2b/0b/5a/2b0b5a49ec1518a4bd785e2fb6c97dc1.jpg",
            "Aamir Khan @ Ranbir Singh Wedding, Mumbai",
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
        InstaPost("", "", "", ""),
        InstaPost("", "", "", ""),
        InstaPost("", "", "", ""),
        InstaPost("", "", "", ""),
        InstaPost("", "", "", ""),
        InstaPost("", "", "", ""),
        InstaPost("", "", "", ""),
    )
    val sizes = arrayListOf<String>("S", "M", "L", "XL", "XXL")

}
