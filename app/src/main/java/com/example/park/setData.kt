package com.example.park

object setData {
    fun SetParks():List<ParkData>{
        var Parklist= mutableListOf<ParkData>()
        Parklist.add(
            ParkData(
                1,
                "Bayanaul",
                "Pavlodar region",
                "424",
                "3500-30000",
                50.797927394350424,
                75.68196832726322,
                "It was founded in 1985 to preserve the unique flora and fauna. The nature of the park is diverse. There are lakes, forest, steppe, mountains, meadows. There are many relict plants growing in the park, such as Bayanaul pine. And among the representatives of the fauna there is an argali listed in the Red Book. The tourist infrastructure of the park is concentrated near Lake Zhasybai and is poorly developed. Excursions to the \"Sacred Cave\" or \"Stone Head\" are popular"
            )
        )
        Parklist.add(
            ParkData(
                2,
                "Burabai",
                "Central",
                "257",
                "4500-12000",
                53.08440458638392,
                70.31597615310241,
                "In this natural park there is a strict regime that restricts economic activity. There are 14 lakes in the park. In one of them, the most accessible, there is a picturesque rock of Zhumbaktas. You can get to it on boats or catamarans taken from rental points. And if you climb the mountains, then from the observation deck you can see the bay of Lake Borovoe. Mount Bolektau is considered easy to climb. The territory of the park is located in a large coniferous forest."
            )
        )
        Parklist.add(
            ParkData(
                3,
                "Katon",
                "East",
                "2914",
                "18000-28000",
                47.40144311571497,
                82.60210905464203,
                "The largest national park in Kazakhstan. Protected by UNESCO. The park can offer a large number of tourist routes, both pedestrian and equestrian. The objects of visits are diverse. Rakhmanov springs are popular for the treatment of skin diseases. Fishing enthusiasts go to Yazevoe Lake. The most beautiful waterfall is Arasan. Tourists interested in history visit the Berel burial ground."
            )
        )
        Parklist.add(
            ParkData(
                4,
                "Charynsky",
                "Almaty region",
                "1415",
                "0",
                49.335523351398635,
                85.78833131646526,
                "The Charyn Canyon in this park attracts many tourists from all over the world. In their opinion, its beauty is not inferior to the Grand Canyon in the USA. The age of some rocks of the canyon is 12 million years. The length of the entire canyon is about 200 km . Most often tourists visit the site with the name \"Valley of Castles\" with a length of 2 km. Walking along it will take about four hours. At the end of the route there is an Eco-park and the Charyn River flows."
            )
        )
        Parklist.add(
            ParkData(
                5,
                "Kolsay",
                "Almaty region",
                "1221",
                "15000",
                42.93572841442755,
                78.3258247104221,
                "The park is located in the Tien Shan Mountains, near the border with Kyrgyzstan. The water in the three lakes of the park is transparent and clean, and its color varies from rich blue to emerald. Natural pristine nature has been preserved around the lakes. Some species of animals living in the park are listed in the Red Book. For lovers of ecotourism, horse riding or hiking in the park, as well as boating on the lakes are offered."
            )
        )
        Parklist.add(
            ParkData(
                6,
                "IleAlatau",
                "Almaty region",
                "414",
                "25000-55000",
                43.157771354427254,
                77.04902249022211,
                "The size of this park is impressive ??? 120 km long, 30 km wide. The creation of the park made it possible to preserve the unique landscape of this territory, as well as preserve the rich flora and fauna. Good conditions have been created for tourists ??? trails are laid through the park, there are cafes. The plans include the construction of a ski resort. You can climb to the snow-capped peaks by car. Also in the park there are ancient mounds near the Turgen gorge and on the Assy plateau."
            )
        )
        Parklist.add(
            ParkData(
                7,
                "AltynEmel",
                "Central",
                "1201",
                "130000-360000",
                44.00411215288424,
                78.83798655569119,
                "Visiting this park is a popular weekend itinerary. The main attraction is the \"singing dunes\". These are hundred-meter sand dunes that emit a rumble audible for several kilometers. On an independent trip, you can meet the famous Przewalski horse. The archaeological site of Besshatyr is interesting. These are the tombs of kings, tombs of the VII-III centuries BC, surrounded by menhirs."
            )
        )
        Parklist.add(
            ParkData(
                8,
                "Karkaraly",
                "Karaganda region",
                "392",
                "88234-298032",
                49.412495410748946,
                75.46721220605878,
                "It is located in the Karaganda region. There are many archaeological sites in the park. These are burial grounds and settlements of different eras. The remnants of a Buddhist monastery of the XVII century is the Kyzylkent Palace. There are many lakes on the territory of the park, and picturesque views open from the mountains. You can appreciate the diversity of the landscape of the park. In addition to birds and mammals, the park is home to various species of amphibians and reptiles."
            )
        )
        return Parklist
    }
}