const HtmlWebpackPlugin = require("html-webpack-plugin");
const MiniCssExtractPlugin = require("mini-css-extract-plugin");
const path = require("path");
const { plugin } = require("postcss");

module.exports = {
    mode:"development",
    entry:{
        webview:"./webview.js",
        pc:"./pc.js"
    },
    output:{
        path:path.resolve(__dirname, "freedirectory"),
        filename:"[name].js"
    },
    module:{
        rules:[
            {
                test:/\.css$/,
                use : [MiniCssExtractPlugin.loader, "css-loader"]
            }
        ]
    },
    plugins:[
        new HtmlWebpackPlugin({
            template:'./webview.html',
            filename:'webview.html',
            chunk:['webview']
        }),
        new HtmlWebpackPlugin({
            template:'./pc.html',
            filename:'pc.html',
            chunk:['pc']
        }),
        new MiniCssExtractPlugin(),
    ]
}