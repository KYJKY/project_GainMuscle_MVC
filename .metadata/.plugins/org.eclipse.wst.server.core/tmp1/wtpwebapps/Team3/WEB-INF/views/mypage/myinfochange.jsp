<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<%@ include file="/WEB-INF/views/inc/asset.jsp"%>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<style>
	    #content{
            width: 100%;
            /* border: 1px solid black; */
            /* box-sizing: border-box; */
        }
        #container{
            width: 1000px;
            margin: 0 auto;
            margin-top: 30px;
            margin-bottom: 200px;
            /* border: 1px solid black; */
            /* box-sizing: border-box; */
        }
		#MyinfoChange {
            margin-top: 50px;
            margin-bottom: 150px;
        }
        #category {
            margin-top: 100px;
            display: flex;
        }
        #category > div {
            box-sizing: border-box;
            border-bottom: 1px solid tomato;
            width: 34%;
            text-align: center;
            height: 30px;
            line-height: 30px;
            font-size: 13px;
            cursor: pointer;
        }
        #category > div:nth-child(3) {
            border: 1px solid tomato;
            border-bottom: 0;
        }
        .line {
            margin-top: 50px;
            border-bottom: 1px solid #ccc;
        }
        #infochecktitle > p:nth-child(1) {
            font-size: 20px;
            margin-top: 100px;
        }
        #memberbox {
            margin-top: 50px;
            border: 1px solid #ccc;
            border-radius: 5px;
            height: 700px;
            display: flex;
            
        }
        #memberboxleft {
            width:20%;
            background-color: #fad390;
            box-sizing: border-box;
            font-size: 14px;
        }
        #memberboxleft div:nth-child(1), #memberboxleft div:nth-child(2), #memberboxleft div:nth-child(3) {
            border: 1px solid #ccc;
            height: 8%;
            text-align: center;
            line-height: 60px;
            color: rgb(68, 68, 68);
            box-sizing: border-box;
        }
        #memberboxleft div:nth-child(4), #memberboxleft div:nth-child(5) {
            border: 1px solid #ccc;
            height: 38%;
            text-align: center;
            line-height: 250px;
            color: rgb(68, 68, 68);
            box-sizing: border-box;
        }
        #memberboxright {
            width:80%;
            box-sizing: border-box;
        }
        #mbrid, #mbrname, #mbrtel{
            border: 1px solid #ccc;
            height: 8%;
            line-height: 60px;
            color: rgb(68, 68, 68);
            box-sizing: border-box;
        }
        #mbrpw, #mbraddress {
            border: 1px solid #ccc;
            height: 38%;
            line-height: 250px;
            color: rgb(68, 68, 68);
            box-sizing: border-box;
        }
        .b1 {
            display: flex;
        }
        #mbrid p, #mbrname p {
            color: rgb(68, 68, 68);
            width: 150px;
            height: 30px;
            margin: 10px 0px 0px 30px;
            line-height: 30px;
            font-size: 12px;
        }
        #mbrtel input[type=text] {
            border: 1px solid #ccc;
            color: rgb(68, 68, 68);
            width: 150px;
            height: 30px;
            margin: 10px 0px 0px 30px;
            border-radius: 5px;
        }
        #mbrpw p {
            color: rgb(68, 68, 68);
            width: 150px;
            height: 30px;
            margin: 43px 0px 0px 30px;
            line-height: 30px;
            font-size: 12px;
            
        }
        #mbraddress p {
            color: rgb(68, 68, 68);
            width: 150px;
            height: 30px;
            margin: 20px 0px 0px 30px;
            line-height: 30px;
            font-size: 12px;
        }
        #mbrtel input[type=button] {
            width: 150px;
            height: 30px;
            margin: 12px 0px 0px 30px;
            color: rgb(68, 68, 68);
            font-weight: bold;
            font-size: 12px;
        }
        #mbraddress input[type=button] {
            width: 150px;
            height: 30px;
            margin: 20px 0px 0px 30px;
            color: rgb(68, 68, 68);
            font-weight: bold;
            font-size: 12px;
        }
        #mbrpw input[type=password] {
            border: 1px solid #ccc;
            color: rgb(68, 68, 68);
            width: 150px;
            height: 30px;
            margin: 41px 0px 0px 30px;
            border-radius: 5px;
        }
        #mbraddress input[type=text] {
            border: 1px solid #ccc;
            color: rgb(68, 68, 68);
            width: 300px;
            height: 30px;
            margin: 20px 0px 0px 30px;
            border-radius: 5px;
        }
        #mbraddress {
            padding-top: 20px;
        }
        #btn1 {
            display: flex;
        }
        #btn1 > input {
            width:150px;
            margin-top: 100px;
            margin-left: 200px;
            height: 30px;
            font-size: 15px;
            background-color: white;
            color: tomato;
            border: 1px solid tomato;
            border-radius: 5px;
            font-family: 'InfinitySans-RegularA1';
            cursor: pointer;
        }
        #btn1 > input:nth-child(1) {
            margin-left: 270px;
        }
        #pwck {
            height: 100px;
            line-height: 115px;
            font-size: 13px;
            width:100px;
            padding-left: 10px;
        }
	</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/inc/header.jsp"%>
    
    <!-- content  -->
    <div id="content">
        <div id="container">
			<div id="MyinfoChange">
                <div id="infochecktitle">
                    <p>??????????????????</p>
                </div>
                
                <div class="line"></div>

                <form action="">
                    <div id="memberbox">
                        <div id="memberboxleft">
                            <div>?????????</div>
                            <div>??????</div>
                            <div>????????? ??????</div>
                            <div>??????????????????</div>
                            <div>?????? ??????</div>
                        </div>
                        <div id="memberboxright">
                            <div id="mbrid">
                                <p id="mbrid1">hong</p>
                            </div>
                            <div id="mbrname">
                                <p id="mbrname1">?????????</p>
                            </div>
                            <div id="mbrtel" class="b1">
                                <input type="text">
                                <input type="button" value="?????? ?????? ??????">
                                <input type="text" placeholder="??????????????????">
                            </div>
                            <div id="mbrpw">
                                <div class="b1">
                                    <p>?????? ????????????</p>
                                    <input type="password">
                                </div>
                                <div class="b1">
                                    <p>??? ????????????</p>
                                    <input type="password" id="pw1">
                                </div>
                                <div class="b1">
                                    <p>??? ???????????? ??????</p>
                                    <input type="password" id="pw2">
                                    <div id="pwck"></div>
                                </div>
                            </div>
                            <div id="mbraddress">
                                <div class="b1">
                                    <p>????????? ??????</p>
                                    <input type="button" value="????????? ??????" onclick="execDaumPostcode()" value="????????????" id="addressApi"
                                    class="addressCode" style="cursor: pointer">
                                </div>
                                <div class="b1">
                                    <p>????????????</p>
                                    <input type="text" id="zipCode">
                                </div>
                                <div class="b1">
                                    <p>??????</p>
                                    <input type="text" id="defaultAddress">
                                </div>
                                <div class="b1">
                                    <p>?????? ??????</p>
                                    <input type="text" id="detailedAddress">
                                </div>
                            </div>
                        </div>
                    </div>

                    <div id="btn1">
                        <input type="button" value="?????????" onclick="location.href='/team3/mypage/myordersearch.do';">
                        <input type="submit" value="??????" id="next">
                        <input type="hidden" name="mbrid" value="">
                        <input type="hidden" name="mbrname" value="">
                    </div>
                </form>
            </div>
	    </div>
    </div>
    
    <!-- footer -->
    <%@ include file="/WEB-INF/views/inc/footer.jsp"%>
    <script>
    
    $('#pw2').keyup(function() {
        console.log('d');
        if($('#pw1').val() == $('#pw2').val()) {
            $('#pwck').text('???????????????.').css('color', 'cornflowerblue');
        } else {
            $('#pwck').text('????????????????????????.').css('color', 'tomato');
        }
    });
    
    $('#next').click(function() {
        $('input[name=mbrid]').attr('value', $('#mbrid1').text());
        $('input[name=mbrname]').attr('value', $('#mbrname1').text());
    });

    function execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function (data) {
                // ???????????? ???????????? ????????? ??????????????? ????????? ????????? ???????????? ??????.

                // ??? ????????? ?????? ????????? ?????? ????????? ????????????.
                // ???????????? ????????? ?????? ?????? ????????? ??????('')?????? ????????????, ?????? ???????????? ?????? ??????.
                var addr = ''; // ?????? ??????
                var extraAddr = ''; // ???????????? ??????

                //???????????? ????????? ?????? ????????? ?????? ?????? ?????? ?????? ????????????.
                if (data.userSelectedType === 'R') { // ???????????? ????????? ????????? ???????????? ??????
                    addr = data.roadAddress;
                } else { // ???????????? ?????? ????????? ???????????? ??????(J)
                    addr = data.jibunAddress;
                }

                // ???????????? ????????? ????????? ????????? ???????????? ??????????????? ????????????.
                if (data.userSelectedType === 'R') {
                    // ??????????????? ?????? ?????? ????????????. (???????????? ??????)
                    // ???????????? ?????? ????????? ????????? "???/???/???"??? ?????????.
                    if (data.bname !== '' && /[???|???|???]$/g.test(data.bname)) {
                        extraAddr += data.bname;
                    }
                    // ???????????? ??????, ??????????????? ?????? ????????????.
                    if (data.buildingName !== '' && data.apartment === 'Y') {
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // ????????? ??????????????? ?????? ??????, ???????????? ????????? ?????? ???????????? ?????????.
                    if (extraAddr !== '') {
                        extraAddr = ' (' + extraAddr + ')';
                    }


                } else {
                    document.getElementById("sample6_extraAddress").value = '';
                }

                // ??????????????? ?????? ????????? ?????? ????????? ?????????.
                document.getElementById('zipCode').value = data.zonecode;
                document.getElementById("defaultAddress").value = addr;
                // ????????? ???????????? ????????? ????????????.
                document.getElementById("detailedAddress").focus();
            }
        }).open();
    }
    
    </script>
</body>
</html>