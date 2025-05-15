import React from "react";

export const User1List = () => {
  return (
    <div className="User1List">
      <h4>User1 목록</h4>
      <table border={1}>
        <tr>
          <th>아이디</th>
          <th>이름</th>
          <th>휴대폰</th>
          <th>나이</th>
          <th>관리</th>
        </tr>
        <tr>
          <td>a101</td>
          <td>홍길동</td>
          <td>010-2121-0001</td>
          <td>21</td>
          <td>
            <button onClick={null}>수정</button>
            <button onClick={null}>삭제</button>
          </td>
        </tr>
      </table>
    </div>
  );
};
