const NewWords = () => {
  console.log("Camehere");
  let text = document.body.innerText;
  const words = {
    펀드: "펀드는 투자자로부터 모은 자금을 자산운용회사가 주식 및 채권 등에 투자운용한 후 그 결과를 돌려주는 간접 투자상품입니다.",
    ESG: "환경, 사회, 기업 지배구조(Environmental, social and corporate governance, ESG)는 기업이나 비즈니스에 대한 투자의 지속 가능성과 사회에 미치는 영향을 측정하는 세 가지 핵심 요소입니다.",
    적금: "적금은 은행 예금 상품의 하나로, 일정 기간을 계약하고 정기적 또는 비정기적으로 금액을 불입하여 계약 기간이 만료된 후 이를 이자와 함께 일괄적으로 돌려받는 것입니다.",
    // 공과금: "국가나 공공 단체가 국민에게 부과하는 금전적인 부담을 의미합니다. 기본적으로 세금을 포함하며, 공공기관에 내게되는 전기요금, 수도요금, 가스요금, 4대 보험료도 넓은 의미에서 공과금이라 부릅니다.",
  };

  let totalElements = "";
  for (var key in words) {
    if (text.indexOf(key) != -1) {
      const toAdd =
        '<li><span class="topic">' +
        key +
        "</span>&nbsp;|&nbsp;&nbsp;" +
        words[key] +
        "</li><br>";
      totalElements += toAdd;
    }
  }
  chrome.runtime.sendMessage({
    msg: totalElements,
  });
  // Update(totalElements);
};

async function GetHtmlAndUpdate() {
  let queryOptions = { active: true, currentWindow: true };
  let [tab] = await chrome.tabs.query(queryOptions);
  console.log("tt");
  console.log(tab.id);
  chrome.scripting.executeScript(
    {
      target: { tabId: tab.id },
      func: NewWords,
    },
    () => {}
  );
}

const Update = (totalElements) => {
  console.log("2");

  // chrome.runtime.sendMessage({
  //   msg: totalElements,
  // });
};

const ParseWord = (key, value) => {
  console.log("1");

  alert(result);
  return result;
};

document.getElementById("reload").addEventListener("click", function () {
  GetHtmlAndUpdate();
});

chrome.runtime.onMessage.addListener(function (request, sender, sendResponse) {
  ChangeView(request.msg);
});

const ChangeView = (msg) => {
  document.getElementById("innerUl").innerHTML = msg;
};
