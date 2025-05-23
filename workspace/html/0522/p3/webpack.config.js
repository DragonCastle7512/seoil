const HtmlWebpackPlugin = require("html-webpack-plugin");
const path = require("path");
const { plugin } = require("postcss");

module.exports = {
    mode:"development",
    entry:{main:"./app.js"},
    output:{filename:"[name].js"},
    module:{
        rules:[
            {
                test:/\.css$/,
                use:["style-loader", "css-loader"]
            }
        ]
    },
    plugins:[
        new HtmlWebpackPlugin({
            template:'./index.html',
            filename:'index.html',
            chunk:['pc']
        })
    ]
}