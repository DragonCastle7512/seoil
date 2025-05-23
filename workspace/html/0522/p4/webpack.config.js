const HtmlWebpackPlugin = require("html-webpack-plugin");
const MiniCssExtractPlugin = require("mini-css-extract-plugin");
const path = require("path");
const { plugin } = require("postcss");

module.exports = {
    mode:"development",
    entry:{main:"./index.js"},
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
            template:'./index.html',
            filename:'index.html',
            chunk:['index']
        }),
        new MiniCssExtractPlugin(),
    ]
}