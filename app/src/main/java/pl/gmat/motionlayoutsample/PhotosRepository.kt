package pl.gmat.motionlayoutsample

private const val baseUrl = "https://images.unsplash.com/"

private val urls = listOf(
    "photo-1526080676457-4544bf0ebba9?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=b737ad3b3a556eba651416be8846bb0f&auto=format&fit=crop&w=1200&q=100",
    "photo-1524654458049-e36be0721fa2?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=f9bac8510ae296aa30e284bfaec2f2d7&auto=format&fit=crop&w=1200&q=100",
    "photo-1519405530001-3b5e82ba4dac?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=46c06cabc068618a7ded13e041a8bd5e&auto=format&fit=crop&w=1200&q=100",
    "photo-1516655855035-d5215bcb5604?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=5da3abb226e19a58e7391bc6bde89d81&auto=format&fit=crop&w=1200&q=100",
    "photo-1517351465112-b5ee87360152?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=d8385462d5973664f0e0346f1be2f33c&auto=format&fit=crop&w=1200&q=100",
    "photo-1519522880597-3a4a62fbf846?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=8e562a75999c44b2f0b97c53fb8dedae&auto=format&fit=crop&w=1200&q=100",
    "photo-1507629221898-576a56b530bb?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=96f43bc9b097274a00d2249385c55c23&auto=format&fit=crop&w=1200&q=100",
    "photo-1519160846162-775b0177e505?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=6b05c235ef2f58b4042647acacd71d8d&auto=format&fit=crop&w=1200&q=100",
    "photo-1508798007600-81eca5e7245b?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=8be53ef1390d7568876f5aafa468b76b&auto=format&fit=crop&w=1200&q=100",
    "photo-1519168459397-81006826b29b?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=3478504060aa7dc22d21ec51a697bf84&auto=format&fit=crop&w=1200&q=100",
    "photo-1508788397430-55907b348ba8?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=db0786d4e2ad0dc64e08df49423e6e18&auto=format&fit=crop&w=1200&q=100",
    "photo-1508913449378-01b9b8174e46?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=88038a2b587ee6134310c479b7acc3d5&auto=format&fit=crop&w=1200&q=100",
    "photo-1508617617809-abceab67a3bb?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=a436c9e643bd24b4abfd7688b3a6842b&auto=format&fit=crop&w=1200&q=100",
    "photo-1508030194646-ad692950d45d?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=8bc658a503b32ad1f643e440271c632b&auto=format&fit=crop&w=1200&q=100",
    "photo-1516821371801-280cf8069a4e?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=4224d48f98e55c77a1b84322a8d8fa61&auto=format&fit=crop&w=1200&q=100",
    "photo-1506653291967-767803668ace?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=4659c0c1c911eb00fae797b264b62ada&auto=format&fit=crop&w=1200&q=100",
    "photo-1508705797775-df0a02b53113?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=ba9c90ede15a4a5e0e391c6478d07f5c&auto=format&fit=crop&w=1200&q=100",
    "photo-1478059299873-f047d8c5fe1a?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=b562551c2207cc414bc9f7551d426c44&auto=format&fit=crop&w=1200&q=100",
    "photo-1508949328298-bf53cc6cecda?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=f1586badeb82b5f8c448a26d86d13cbe&auto=format&fit=crop&w=1200&q=100",
    "photo-1503401639559-b16332601594?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=642189d3185b899a6e755f00ab39ef20&auto=format&fit=crop&w=1200&q=100",
    "photo-1507313455804-230c1a9af4f3?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=4ee7df6295fedf0d655e29b54819a44f&auto=format&fit=crop&w=1200&q=100",
    "photo-1477346611705-65d1883cee1e?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=4e58a56fd7bd17453e3cf914aa365870&auto=format&fit=crop&w=1200&q=100",
    "photo-1475694867812-f82b8696d610?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=e21d678970fa15a14d35ec9ce1507eb1&auto=format&fit=crop&w=1200&q=100",
    "photo-1506451354516-8fcd4e82505f?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=85915ebb43ee02bca16310e97a68618c&auto=format&fit=crop&w=1200&q=100",
    "photo-1506782081254-09bcfd996fd6?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=2017d4b1eb1e1c3c619f3a778844b39c&auto=format&fit=crop&w=1200&q=100",
    "photo-1483311250690-472f4decaf93?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=4aa4157917e58138ede854843c506e9c&auto=format&fit=crop&w=1200&q=100",
    "photo-1489945796694-07eba0228bc7?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=d1a81eb5f2e6d1b80357e13c12fbe04e&auto=format&fit=crop&w=1200&q=100",
    "photo-1504208434309-cb69f4fe52b0?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=f35e7bc5ab7c860cef3684c704b7fe1f&auto=format&fit=crop&w=1200&q=100",
    "photo-1486854561807-38fc02359493?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=3594bbce5178d8c54348005e8917bbfd&auto=format&fit=crop&w=1200&q=100",
    "photo-1503751192943-5537c30ba181?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=47b447b0a69207dc6f8cfde32958539e&auto=format&fit=crop&w=1200&q=100"
)

class PhotosRepository {

    val photos
        get() = generatePhotos()

    val randomPhoto
        get() = Photo(0, "$baseUrl${urls.random()}")

    private fun generatePhotos() = urls.mapIndexed { index, url -> Photo(id = index, url = "$baseUrl$url") }.shuffled()

}