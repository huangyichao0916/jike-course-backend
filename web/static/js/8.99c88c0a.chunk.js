(this["webpackJsonpfirst-project"]=this["webpackJsonpfirst-project"]||[]).push([[8],{114:function(e,t,a){"use strict";t.a=function(e,t){var a=null;return function(){for(var n=this,c=arguments.length,r=new Array(c),o=0;o<c;o++)r[o]=arguments[o];a&&clearTimeout(a),a=setTimeout((function(){e.apply(n,r),clearTimeout(a)}),t)}}},150:function(e,t,a){},151:function(e,t,a){},152:function(e,t,a){},153:function(e,t,a){},154:function(e,t,a){},155:function(e,t,a){},156:function(e,t,a){},204:function(e,t,a){"use strict";a.r(t);var n,c=a(83),r=a(0),o=a.n(r),i=(a(150),a(19)),s=a.n(i),l=(a(41),a(75)),u=a(76),m=a(78),f=a(77),d=(a(151),a(152),function(e){Object(m.a)(a,e);var t=Object(f.a)(a);function a(){return Object(l.a)(this,a),t.apply(this,arguments)}return Object(u.a)(a,[{key:"render",value:function(){var e=this.props,t=e.name,a=e.icon,n=e.product_count;return o.a.createElement("div",{className:"studyPathItem"},o.a.createElement("div",{className:"description"},o.a.createElement("div",{className:"type"},t),o.a.createElement("div",{className:"totalLessons"},"\u5171\u6709",n,"\u95e8\u8bfe\u7a0b")),o.a.createElement("div",{className:"img"},o.a.createElement("img",{src:a,alt:""})))}}]),a}(r.PureComponent)),v=function(e){Object(m.a)(a,e);var t=Object(f.a)(a);function a(){var e;Object(l.a)(this,a);for(var n=arguments.length,c=new Array(n),r=0;r<n;r++)c[r]=arguments[r];return(e=t.call.apply(t,[this].concat(c))).state={data:[]},e}return Object(u.a)(a,[{key:"componentDidMount",value:function(){var e=this;s.a.get("/data/studyPath.json").then((function(t){return e.setState({data:t.data})}))}},{key:"render",value:function(){var e=this.state.data.map((function(e,t){var a=e.id,n=e.name,c=e.icon,r=e.product_count;return o.a.createElement(d,{key:a,name:n,product_count:r,icon:c})}));return o.a.createElement("div",{className:"studyPath"},o.a.createElement("div",{className:"top"},o.a.createElement("div",{className:"left"},"\u5b66\u4e60\u8def\u5f84"),o.a.createElement("div",{className:"right"},"\u67e5\u770b\u5168\u90e8")),o.a.createElement("div",{className:"studyPathItemWrapper"},o.a.createElement("div",{className:"content"},e)))}}]),a}(r.PureComponent),p=(a(153),a(154),function(e){var t=e.title,a=e.myClassname;return o.a.createElement("div",{className:a},t)}),h=a(79),E=a.n(h),b=o.a.memo((function(){var e=Object(r.useMemo)((function(){return["\u8ba1\u7b97\u673a\u4e13\u4e1a\u8bfe","\u540e\u7aef&\u67b6\u6784","\u524d\u7aef&\u79fb\u52a8","\u4ea7\u54c1&\u8fd0\u8425","\u4eba\u5de5\u667a\u80fd&\u5927\u6570\u636e","\u8fd0\u7ef4&\u6d4b\u8bd5","\u7ba1\u7406&\u6548\u7387","\u804c\u573a\u8f6f\u6280\u80fd","\u9762\u8bd5\u4e13\u573a"]}),[]),t=Object(r.useMemo)((function(){return e.map((function(e,t){var a=t%2!==0;return o.a.createElement(p,{key:t,title:e,myClassname:E()({courseDirectionItem:!0,evenNumberItem:a})})}))}),[]);return o.a.createElement("div",{className:"courseDirection"},o.a.createElement("div",{className:"courseDirectionTop"},o.a.createElement("div",{className:"left"},"\u8bfe\u7a0b\u65b9\u5411"),o.a.createElement("div",{className:"right"},"\u67e5\u770b\u5168\u90e8")),o.a.createElement("div",{className:"courseDirectionItemWrapper"},t))})),y=(a(155),a(156),a(89)),j=function(e){var t=e.title,a=e.authorName,n=e.authorDesc,c=e.avatar,r=e.articleCount,i=e.totalPeopleLearn,s=e.priceMarket,l=e.priceSale,u=e.haveLearned,m=e.index,f=e.handleBuyLesson,d=u?o.a.createElement(y.a,{clickable:!1},"\u5df2\u8d2d\u4e70"):o.a.createElement(y.a,{myOnClick:function(){f(l,m,{title:t,authorName:a,authorDesc:n})},clickable:!0},"\u8d2d\u4e70");return o.a.createElement("div",{className:"practiceCamp-item2"},d,o.a.createElement("div",{className:"practiceCamp-item-img"},o.a.createElement("img",{src:c,alt:"\u56fe\u7247\u4e0d\u89c1\u4e86"})),o.a.createElement("div",{className:"practiceCamp-item-detail"},o.a.createElement("div",{className:"practiceCamp-item-name"},t),o.a.createElement("div",{className:"practiceCamp-item-teacher"},o.a.createElement("div",{className:"practiceCamp-item-teacher-name"},a),o.a.createElement("div",{className:"practiceCamp-item-teacher-desc"},n)),o.a.createElement("div",{className:"practiceCamp-item-time"},r,"\u8bb2\uff5c",i,"\u4eba\u5df2\u5b66\u4e60"),o.a.createElement("div",{className:"price-and-join"},o.a.createElement("div",{className:"practiceCamp-new-first-indent"},"\u65b0\u4eba\u9996\u5355"),o.a.createElement("div",{className:"practiceCamp-item-price"},"\uffe5",l),o.a.createElement("div",{className:"practiceCamp-item-oldprice"},"\uffe5",s))))},N=a(22),O=a(20),C=Object(O.b)((function(e){return{}}),(function(e){return{handleBuyLesson:function(t,a,n){e(Object(N.d)(t,a,n))}}}))((function(e){var t=e.courseLessonDataSource,a=e.handleBuyLesson,n=t.map((function(e,t){return o.a.createElement(j,Object.assign({},e,{index:t,key:e.id,handleBuyLesson:a}))}));return o.a.createElement("div",{className:"allCourses"},o.a.createElement("div",{className:"allCoursesTop"},"\u5168\u90e8\u8bfe\u7a0b"),o.a.createElement("div",{className:"allCoursesNavBar"},o.a.createElement("div",{className:"left"},"\u8bfe\u7a0b\u5f62\u5f0f"),o.a.createElement("div",{className:"middle"},"\u8ba2\u9605\u72b6\u6001"),o.a.createElement("div",{className:"right"},"\u4e0a\u65b0")),o.a.createElement("div",{className:"allCoursesItemWrapper"},n))})),g=a(120),k=a(113),w=a(121),L=a(114),D=w.a.div(n||(n=Object(g.a)(["\n    width: 100%;\n    height: 60vh;\n"]))),S=function(e){var t=Object(r.useState)(null),a=Object(c.a)(t,2),n=a[0],i=a[1],s=Object(r.useRef)(),l=e.direction,u=void 0===l?"vertical":l,m=e.click,f=void 0===m||m,d=e.refresh,v=void 0===d||d,p=e.bounceTop,h=void 0===p||p,E=e.bounceBottom,b=void 0===E||E,y=e.pullUp,j=void 0===y?function(){console.log("\u62c9\u5230\u4e86\u5e95\u90e8")}:y,N=e.pullDown,O=void 0===N?function(){console.log("\u62c9\u5230\u4e86\u9876\u90e8")}:N,C=e.onScroll,g=Object(r.useMemo)((function(){return Object(L.a)(j,500)}),[j]),w=Object(r.useMemo)((function(){return Object(L.a)(O,500)}),[O]);return Object(r.useEffect)((function(){var e=new k.a(s.current,{scrollX:"horizental"===u,scrollY:"vertical"===u,probeType:3,click:f,bounce:{top:h,bottom:b}});return i(e),function(){i(null)}}),[]),Object(r.useEffect)((function(){if(n&&C)return n.on("scroll",C),function(){n.off("scroll",C)}}),[C,n]),Object(r.useEffect)((function(){if(n&&j){var e=function(){n.y<=n.maxScrollY+100&&g()};return n.on("touchEnd",e),function(){n.off("touchEnd",e)}}}),[j,g,n]),Object(r.useEffect)((function(){if(n&&O){var e=function(e){e.y>50&&w()};return n.on("touchEnd",e),function(){n.off("touchEnd",e)}}}),[O,w,n]),Object(r.useEffect)((function(){v&&n&&n.refresh()})),o.a.createElement(D,{ref:s},e.children)};t.default=Object(O.b)((function(e){return{courseLessonDataSource:e.getIn(["courseLessonDataSource"]).toJS()}}),(function(e){return{addDataToCourseLesson:function(t){e(Object(N.a)(t))},refreshCourseLesson:function(t){e(Object(N.g)(t))}}}))((function(e){var t=e.courseLessonDataSource,a=e.addDataToCourseLesson,n=e.refreshCourseLesson,i=t.length,l=Object(r.useState)(0),u=Object(c.a)(l,2),m=u[0],f=u[1],d=Object(r.useCallback)((function(e){s.a.get("/mock/course/lesson?offset=".concat(e)).then((function(e){if(!e.data)throw new Error("\u6240\u6709\u6570\u636e\u90fd\u5c55\u793a\u5b8c\u6bd5\uff0c\u65e0\u6570\u636e");f(e.data.offset),a(e.data.data),console.log("load success")})).catch((function(e){return console.log(e)}))}),[]),p=Object(r.useCallback)((function(e){s.a.get("/mock/course/lesson?offset=".concat(e)).then((function(e){if(!e.data)throw new Error("\u6240\u6709\u6570\u636e\u90fd\u5c55\u793a\u5b8c\u6bd5\uff0c\u65e0\u6570\u636e");f(e.data.offset),n(e.data.data),console.log("refresh success")})).catch((function(e){return console.log(e)}))}),[]);return Object(r.useEffect)((function(){i>0||d(0)}),[]),o.a.createElement(S,{pullUp:function(){return d(m)},pullDown:function(){return p(m)}},o.a.createElement("div",{className:"contentLesson"},o.a.createElement(v,null),o.a.createElement(b,null),o.a.createElement(C,{courseLessonDataSource:t})))}))},83:function(e,t,a){"use strict";a.d(t,"a",(function(){return c}));var n=a(21);function c(e,t){return function(e){if(Array.isArray(e))return e}(e)||function(e,t){if("undefined"!==typeof Symbol&&Symbol.iterator in Object(e)){var a=[],n=!0,c=!1,r=void 0;try{for(var o,i=e[Symbol.iterator]();!(n=(o=i.next()).done)&&(a.push(o.value),!t||a.length!==t);n=!0);}catch(s){c=!0,r=s}finally{try{n||null==i.return||i.return()}finally{if(c)throw r}}return a}}(e,t)||Object(n.a)(e,t)||function(){throw new TypeError("Invalid attempt to destructure non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}()}},89:function(e,t,a){"use strict";var n=a(0),c=a.n(n),r=a(79),o=a.n(r);a(91);t.a=function(e){var t=e.myOnClick,a=e.clickable,r=Object(n.useRef)();Object(n.useEffect)((function(){r.current.parentNode.style.position="relative"}),[]);var i=o()({myButton:!0},{clickable:a}),s=null;return t&&a&&(s=function(){for(var e=arguments.length,a=new Array(e),n=0;n<e;n++)a[n]=arguments[n];t.call.apply(t,[this].concat(a))}),c.a.createElement("button",{className:i,onClick:s,ref:r},e.children)}},91:function(e,t,a){}}]);
//# sourceMappingURL=8.99c88c0a.chunk.js.map